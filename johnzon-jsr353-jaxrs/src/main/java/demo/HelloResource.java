package demo;

import org.springframework.stereotype.Component;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/")
public class HelloResource {

    @GET
    public JsonObject hello() {
        return Json.createObjectBuilder()
                .add("name", "@making")
                .add("age", 18)
                .build();
    }
}
