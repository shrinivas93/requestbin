package com.requestbin.requestbinapi.api;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.requestbin.requestbinapi.document.Endpoint;
import com.requestbin.requestbinapi.service.EndpointService;

@Component
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("")
public class EndpointApi {

	@Autowired
	private EndpointService endpointService;

	@Autowired
	private ObjectMapper objectMapper;

	@GET
	@Path("{endpointId}/info")
	public Response getEndpoint(@PathParam("endpointId") String endpointId)
			throws JsonGenerationException, JsonMappingException, IOException {
		Endpoint endpoint = endpointService.getEndpoint(endpointId);
		return Response.ok().entity(objectMapper.writeValueAsString(endpoint)).build();
	}

	@POST
	@Path("endpoint")
	public Response createEndpoint(String endpointStr)
			throws JsonGenerationException, JsonMappingException, IOException {
		Endpoint endpoint = objectMapper.readValue(endpointStr, Endpoint.class);
		Endpoint createEndpoint = endpointService.createEndpoint(endpoint);
		return Response.ok().entity(objectMapper.writeValueAsString(createEndpoint)).build();
	}
}
