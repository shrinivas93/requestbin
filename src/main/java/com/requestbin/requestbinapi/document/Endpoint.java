package com.requestbin.requestbinapi.document;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "endpoint")
public class Endpoint {

	@Id
	@JsonIgnore
	private String id;

	private String endpointId;

	private String endpointName;

	public Endpoint() {
		// TODO Auto-generated constructor stub
	}

	public Endpoint(String endpointId, String endpointName) {
		this.endpointId = endpointId;
		this.endpointName = endpointName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEndpointId() {
		return endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
	}

	public String getEndpointName() {
		return endpointName;
	}

	public void setEndpointName(String endpointName) {
		this.endpointName = endpointName;
	}

	@Override
	public String toString() {
		return "Endpoint [id=" + id + ", endpointId=" + endpointId + ", endpointName=" + endpointName + "]";
	}

}
