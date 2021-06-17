package com.igorzaitcev.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.igorzaitcev.model.ClientDTO;


@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/restclient")
public interface ClientController {
	
	@Path("/contract")
	@POST
	public Response createClient(ClientDTO client);

}
