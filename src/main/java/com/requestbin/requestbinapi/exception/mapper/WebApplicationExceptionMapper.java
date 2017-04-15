package com.requestbin.requestbinapi.exception.mapper;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class WebApplicationExceptionMapper implements ExceptionMapper<WebApplicationException> {

	@Override
	public Response toResponse(WebApplicationException exception) {
		String message = exception.getMessage();
		int code = exception.getResponse().getStatus();
		return Response.status(code).entity(message).build();
	}

}
