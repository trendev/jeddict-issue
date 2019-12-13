package fr.trendev.jeddict.issue.resources;

import fr.trendev.jeddict.issue.resources.domain.Entity_1;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("javaee8")
public class JavaEE8Resource {
    
    @GET
    public Response hello(){
        return Response
                .ok(new Entity_1("hello"))
                .build();
    }
}
