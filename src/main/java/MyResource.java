package org.javaproject.dropwizarddemo;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
/**
 * Root resource (exposed at "myresource" path)
 * http://localhost:8080/myresource
 *
 * from section 1.2 of https://jersey.github.io/documentation/latest/getting-started.html
 */
@Path("myresource")
public class MyResource {
 
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    @POST
    @Path(value = "/postexample")
    @Consumes("application/json")
    @Produces(MediaType.TEXT_PLAIN)
    public String postExample() {
        return "Posted!";
    }
}   