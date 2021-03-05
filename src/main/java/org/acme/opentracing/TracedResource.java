package org.acme.opentracing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class TracedResource {

    private static final Logger LOG = LoggerFactory.getLogger(TracedResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        LOG.info("hello world");
        return "hello";
    }
}
