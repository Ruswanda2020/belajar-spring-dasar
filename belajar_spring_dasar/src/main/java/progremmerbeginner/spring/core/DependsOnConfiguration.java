package progremmerbeginner.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import progremmerbeginner.spring.core.data.Bar;
import progremmerbeginner.spring.core.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    @Lazy
    @Bean
    @DependsOn({
            "bar"
    })
    public Foo foo(){
        log.info("create new foo");
        return new Foo();
    }
    @Bean
    public Bar bar(){
        log.info("create new bar");
        return new Bar();
    }

}
