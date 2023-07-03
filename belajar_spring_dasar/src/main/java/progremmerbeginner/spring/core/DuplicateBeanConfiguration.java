package progremmerbeginner.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import progremmerbeginner.spring.core.data.Foo;

@Configuration
@Slf4j
public class DuplicateBeanConfiguration {
    @Bean
    public Foo foo1(){
        Foo foo = new Foo();
        log.info("foo 1");
        return foo;
    }
    @Bean
    public Foo foo2(){
        Foo foo = new Foo();
        log.info("foo 2");
        return foo;
    }

}
