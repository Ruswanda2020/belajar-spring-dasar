package progremmerbeginner.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "progremmerbeginner.spring.core.service",
        "progremmerbeginner.spring.core.repository",
        "progremmerbeginner.spring.core.configuration"

})

public class ComponentConfiguration {

}
