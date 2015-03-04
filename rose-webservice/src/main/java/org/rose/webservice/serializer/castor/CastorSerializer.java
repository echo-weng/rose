package org.rose.webservice.serializer.castor;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.rose.webservice.serializer.MarshalException;
import org.rose.webservice.serializer.SerializerException;
import org.rose.webservice.serializer.StreamSerializer;
import org.rose.webservice.serializer.UnmarshalException;
import org.xml.sax.InputSource;

/**
 * @author echo
 */
public class CastorSerializer implements StreamSerializer {

	protected final Log log = LogFactory.getLog(getClass());
	protected Mapping mapping;
	protected List<String> mappingLocations;
	protected Map<String, String> namespaces;

	protected Mapping createMapping() throws SerializerException {
		try {
			Mapping mapping = new Mapping();
			if (mappingLocations != null) {
				for (String eachMapping : mappingLocations) {
					if (log.isDebugEnabled()) {
						log.debug("load mapping " + eachMapping);
					}
					mapping.loadMapping(Thread.currentThread().getContextClassLoader().getResource(eachMapping));
				}
			}
			return mapping;
		} catch (Exception e) {
			throw new SerializerException(e);
		}
	}

	private synchronized void initMappingIfNecessary() {
		if (mapping == null) {
			mapping = createMapping();
		}
	}

	@Override
	public void marshal(Object object, OutputStream outputStream, String encoding) throws MarshalException {
		try {
			OutputStreamWriter writer;
			if (encoding == null) {
				encoding = "UTF-8";
			}
			writer = new OutputStreamWriter(outputStream, encoding);
            initMappingIfNecessary();
            Marshaller marshaller = new Marshaller(writer);
            synchronized (mapping) {
                marshaller.setMapping(mapping);
            }
            if (namespaces != null) {
                Set<Entry<String, String>> entrySet = namespaces.entrySet();
                for (Entry<String, String> each : entrySet) {
                    if (log.isDebugEnabled()) {
                        log.debug("set namesapce " + each.getKey() + " " + each.getValue());
                    }
                    marshaller.setNamespaceMapping(each.getKey(), each.getValue());
                }
            }
            initMarshaller(marshaller);

            marshaller.marshal(object);
		} catch (Exception e) {
			throw new MarshalException(e);
		}
	}

	@Override
	public Object unmarshal(InputStream inputStream, String encoding) throws UnmarshalException {
		InputSource inputSource = new InputSource(inputStream);
		if (encoding != null) {
			inputSource.setEncoding(encoding);
		}
		return unmarshal(inputSource);
	}

	public Object unmarshal(InputSource inputSource) throws UnmarshalException {
		initMappingIfNecessary();
		try {
			Unmarshaller unmarshaller = new Unmarshaller();
			synchronized (mapping) {
				unmarshaller.setMapping(mapping);
			}
			initUnmarshaller(unmarshaller);
			return unmarshaller.unmarshal(inputSource);
		} catch (Exception e) {
			throw new UnmarshalException(e);
		}
	}

	/**
	 * init the marshaller of castor
	 * 
	 * @param marshaller
	 */
	protected void initMarshaller(Marshaller marshaller) {
		// do nothing
	}

	/**
	 * init the unmarshaller of castor
	 *
	 * @param unmarshaller
	 */
	protected void initUnmarshaller(Unmarshaller unmarshaller) {
		// do nothing
	}

	public synchronized void addNamespace(String key, String value) {
		if (namespaces == null) {
			namespaces = new HashMap<String, String>();
		}
		namespaces.put(key, value);
	}

	public synchronized void addMappingLocation(String mappingLocation) {
		if (mappingLocations == null) {
			mappingLocations = new ArrayList<String>();
		}
		mappingLocations.add(mappingLocation);
	}

	public List<String> getMappingLocations() {
		return mappingLocations;
	}

	public Map<String, String> getNamespaces() {
		return namespaces;
	}

	/**
	 * set a list of mapping locations for castor serializer
	 * 
	 * @param mappingLocations
	 */
	public void setMappingLocations(List<String> mappingLocations) {
		if (mappingLocations == null) {
			return;
		}
		for (String each : mappingLocations) {
			addMappingLocation(each);
		}
	}

	/**
	 * set a map of the namespaces used in the castor serializer
	 * 
	 * @param namespaces
	 */
	public void setNamespaces(Map<String, String> namespaces) {
		if (namespaces == null) {
			return;
		}
		for (Entry<String, String> entry : namespaces.entrySet()) {
			addNamespace(entry.getKey(), entry.getValue());
		}
	}

	public Mapping getMapping() {
		return mapping;
	}

	public void setMapping(Mapping mapping) {
		this.mapping = mapping;
	}
}
