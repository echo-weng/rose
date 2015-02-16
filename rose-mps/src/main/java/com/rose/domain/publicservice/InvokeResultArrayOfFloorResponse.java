package com.rose.domain.publicservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.rose.domain.publicservice.model.ArrayOfFloorResponse;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvokeResult_ArrayOfFloorResponse", propOrder = { "code", "content", "id", "success" })
public class InvokeResultArrayOfFloorResponse {

	@XmlElementRef(name = "Code", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", type = JAXBElement.class)
	protected JAXBElement<String> code;
	@XmlElementRef(name = "Content", namespace = "http://schemas.datacontract.org/2004/07/NextPms.PublicService.Service", type = JAXBElement.class)
	protected JAXBElement<ArrayOfFloorResponse> content;
	@XmlElement(name = "Id")
	protected Long id;
	@XmlElement(name = "Success")
	protected Boolean success;

	public JAXBElement<String> getCode() {
		return code;
	}

	public void setCode(JAXBElement<String> value) {
		this.code = ((JAXBElement<String>) value);
	}

	public JAXBElement<ArrayOfFloorResponse> getContent() {
		return content;
	}

	public void setContent(JAXBElement<ArrayOfFloorResponse> value) {
		this.content = ((JAXBElement<ArrayOfFloorResponse>) value);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long value) {
		this.id = value;
	}

	public Boolean isSuccess() {
		return success;
	}

	public void setSuccess(Boolean value) {
		this.success = value;
	}

}
