package progremmerbeginner.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import progremmerbeginner.spring.core.configuration.BarConfiguration;
import progremmerbeginner.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {

}
