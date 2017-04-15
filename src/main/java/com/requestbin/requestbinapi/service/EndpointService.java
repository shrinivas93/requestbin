package com.requestbin.requestbinapi.service;

import com.requestbin.requestbinapi.document.Endpoint;

public interface EndpointService {
	Endpoint getEndpoint(String endpointId);

	Endpoint createEndpoint(Endpoint endpoint);
}
