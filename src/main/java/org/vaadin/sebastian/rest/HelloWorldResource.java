package org.vaadin.sebastian.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/rest")
public class HelloWorldResource {

    @GET
    @Path("helloworld")
    public String helloworld() {
        return "Helloworld !!!!";
    }
}
