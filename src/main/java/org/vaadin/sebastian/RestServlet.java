package org.vaadin.sebastian;

import org.glassfish.jersey.server.ResourceConfig;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.ws.rs.ApplicationPath;

@WebServlet(value = "/services/*", initParams = {
        @WebInitParam(name = "jersey.config.server.provider.packages", value = "org.vaadin.sebastian.rest")
})
public class RestServlet extends org.glassfish.jersey.servlet.ServletContainer {
    public RestServlet() {

    }
}
