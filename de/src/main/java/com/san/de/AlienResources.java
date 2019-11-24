package com.san.de;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import java.util.*;


@Path("aliens")
@Consumes(MediaType.APPLICATION_JSON)
public class AlienResources {
	AlienRepository repo = new AlienRepository();
	@POST
	public Alien createAlien(Alien a1) {
		Gson g = new Gson();
		System.out.println(a1);
		repo.create(a1);
		return a1;
	}
	@GET
	@Path("alien")
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien >getAliens() {
		return repo.getAliens();
	}
	@GET
	@Path("alien/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Alien getAlien(@PathParam("id")int id) {
		return repo.getAlien(id);
	}

}
