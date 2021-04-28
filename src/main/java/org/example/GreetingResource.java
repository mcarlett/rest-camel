package org.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    /**
     * Say hello.
     * @return String, the message
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
       return "Hello RESTEasy after webhook2";
    }
}
