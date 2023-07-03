package progremmerbeginner.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import progremmerbeginner.spring.core.service.AutService;

public class AwareTest {
    @Component
    @Import({AutService.class})
    public static class TestConfiguration{

    }

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }

    @Test
    void testAware() {

        AutService autService = applicationContext.getBean(AutService.class);

        Assertions.assertEquals("progremmerbeginner.spring.core.service.AutService",autService.getBeanName());
        Assertions.assertNotNull(autService.getApplicationContext());
    }
}
