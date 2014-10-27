package demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig extends ResourceConfig {
    public AppConfig() {
        packages(true, "demo", "org.apache.johnzon");
    }
}