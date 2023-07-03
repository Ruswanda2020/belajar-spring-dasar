package progremmerbeginner.spring.core.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import progremmerbeginner.spring.core.data.Foo;

public class WithoutSpringBoot {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
        applicationContext.refresh();
    }

    @Test
    void testWithoutSpringBoot() {
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
