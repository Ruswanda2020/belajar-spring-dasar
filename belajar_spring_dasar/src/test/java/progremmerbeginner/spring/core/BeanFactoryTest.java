package progremmerbeginner.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import progremmerbeginner.spring.core.data.Foo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeanFactoryTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
    }

    @Test
    void testBeanFactory() {

        ObjectProvider<Foo> beanProvider = applicationContext.getBeanProvider(Foo.class);
        List<Foo> collect = beanProvider.stream().collect(Collectors.toList());

        System.out.println(collect);

        Map<String, Foo> beansOfType = applicationContext.getBeansOfType(Foo.class);
        System.out.println(beansOfType);
    }
}
