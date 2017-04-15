package com.requestbin.requestbinapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.requestbin.requestbinapi.document.Endpoint;

public interface EndpointRepository extends MongoRepository<Endpoint, String> {

	Endpoint findByEndpointId(String endpointId);

}
