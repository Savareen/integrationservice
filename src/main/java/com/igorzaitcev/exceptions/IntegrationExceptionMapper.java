package com.igorzaitcev.exceptions;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class IntegrationExceptionMapper implements ExceptionMapper<IntegrationCustomException> {

    @Override
    public Response toResponse(IntegrationCustomException exception) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"status\":\"error\"");
        sb.append(",");
        sb.append("\"message\":\"Customer request failed\"");
        sb.append("}");
        return Response.serverError().entity(sb.toString()).type(MediaType.APPLICATION_JSON).build();
    }
}
