package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.json.Json;
import javax.json.JsonObject;

@RestController
public class HelloController {

    @RequestMapping("/")
    JsonObject hello() {
        return Json.createObjectBuilder()
                .add("name", "@making")
                .add("age", 18)
                .build();
    }
}
