package test;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class hello {
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayhello(){
        String resource ="<? cml version='1.0' ?>"+
                "<hello>Hi Suryan,This is Hello from xml</hello>";
        return resource;
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayhelloJason(){
        String resource ="null";
        return resource;
    }


    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHello(){
        String resource ="<h1> Hi Suryan,This is Hello from HTML</h1>";
        return resource;
    }

}
