package com.rose.elong.request;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class XMLRequestTest {

	@Test
	public void testLogin() throws Exception {
//		URL url = new URL("http://directconnection/HotelAPI/V1.0/SouthBoundService.svc");
		
		HttpClient client = new HttpClient();
		
		PostMethod myPost = new PostMethod("http://directconnection/HotelAPI/V1.0/SouthBoundService.svc");
		
		myPost.setRequestHeader("Content-Type","text/xml");
        myPost.setRequestHeader("charset","utf-8");
        myPost.setRequestHeader("SOAPAction", "http://tempuri.org/IAuthenticationService/Login");
        myPost.setRequestBody(XMLRequestTest.class.getResourceAsStream("login.xml"));
        
        int statusCode = client.executeMethod(myPost); 
        System.out.println(statusCode);
        System.out.println(formateXml(IOUtils.toString(myPost.getResponseBodyAsStream())));
	}

	private String formateXml(String xml) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		char[] chars = xml.toCharArray();
		StringBuffer sb = new StringBuffer();
		StringBuffer preNode = new StringBuffer();
		StringBuffer node = new StringBuffer();
		StringBuffer temp = new StringBuffer();

		boolean nodeStartAppend = true;
		for (char c : chars) {
			if ('<' == c) {
				if (temp.length() > 0 && temp.toString().startsWith("<") == false) {
					temp.append(c);
					sb.append(temp.toString());
					continue;
				}

				nodeStartAppend = true;

				appendTemp(map, node, preNode, sb, temp);

				empty(temp);
				temp.append(c);
				empty(preNode);
				preNode.append(node);
				empty(node);
				continue;
			}
			if ('>' == c) {
				nodeStartAppend = false;
				temp.append(c);
				continue;
			}
			if (' ' == c) {
				nodeStartAppend = false;
			}
			if (nodeStartAppend && '/' != c) {
				node.append(c);
			}
			temp.append(c);
		}
		appendTemp(map, node, preNode, sb, temp);
		
		return sb.toString();
	}

	private void empty(StringBuffer sb){
		sb.delete(0, sb.length());
	}
	
	private void appendTemp(Map<String, Integer> map, StringBuffer node, StringBuffer preNode, StringBuffer sb,
			StringBuffer temp) {
		Integer max = getMax(map);
		if (exits(node.toString(), map)) {
			map.remove(node.toString());
			max = max - 1;
		} else {
			if (node.length() > 0 && node.toString().startsWith("?xml") == false) {
				map.put(node.toString(), max + 1);
			}
		}
		if (preNode.toString().equals(node.toString()) == false && temp.toString().startsWith("<?") == false) {
			if (sb.toString().endsWith("\n") == false) {
				sb.append("\n");
			}
			for (int i = 0; i < max; i++) {
				sb.append("\t");
			}
		}
		sb.append(temp.toString());
	}

	private Integer getMax(Map<String, Integer> map) {
		if (map.isEmpty())
			return 0;
		Integer max = 0;
		for (Integer num : map.values()) {
			if (max < num) {
				max = num;
			}
		}
		return max;
	}

	private boolean exits(String node, Map<String, Integer> map) {
		return map.get(node) != null;
	}
}
