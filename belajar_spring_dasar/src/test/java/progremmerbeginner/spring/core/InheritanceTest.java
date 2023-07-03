package progremmerbeginner.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import progremmerbeginner.spring.core.service.MerchantService;
import progremmerbeginner.spring.core.service.MerchantServiceImpl;

public class InheritanceTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
    }

    @Test
    void testInheritance() {
        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchantServiceImpl service = applicationContext.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merchantService,service);
    }
}
