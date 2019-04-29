package com.unw.service;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author UNGERW
 */
@Component
@Path("/spring-docker/")
public class HelloWorldService {
    @Autowired
    BuildProperties buildProperties;

    @GET
    @Path("/hello")
    public Response test() {
        return Response.status(200).entity("CMA HOME Page , Date 26.04.2019 10:01 AM - welcome to CMA workbench project version :: " + 		buildProperties.getVersion()).build();
    }
}
