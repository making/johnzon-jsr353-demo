package demo;

import com.fasterxml.jackson.datatype.jsr353.JSR353Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    JSR353Module jsr353Module() {
        return new JSR353Module();
    }
}