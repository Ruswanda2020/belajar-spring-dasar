package progremmerbeginner.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import progremmerbeginner.spring.core.data.Foo;

@Configuration
@Slf4j
public class ScopeConfiguration {
    @Bean
    @Scope("prototype")
    public Foo foo(){
        return new Foo();
    }
}
