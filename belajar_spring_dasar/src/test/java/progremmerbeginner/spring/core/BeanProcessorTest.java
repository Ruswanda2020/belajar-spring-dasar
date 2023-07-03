package progremmerbeginner.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import progremmerbeginner.spring.core.Processor.IdGeneratorBeanPostProcessor;
import progremmerbeginner.spring.core.data.Car;

public class BeanProcessorTest {
    @Configuration
    @Import({Car.class,IdGeneratorBeanPostProcessor.class})
    public static class TestConfiguration{

    }

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }

    @Test
    void testCar() {

        Car car = applicationContext.getBean(Car.class);
        System.out.println(car.getId());

        Assertions.assertNotNull(car.getId());
    }
}
