package progremmerbeginner.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import progremmerbeginner.spring.core.repository.CategoryRepository;
import progremmerbeginner.spring.core.repository.ProductRepository;
import progremmerbeginner.spring.core.service.CategoryService;
import progremmerbeginner.spring.core.service.ProductService;

public class ComponentTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @Test
    void testComponentService() {
        ProductService service = applicationContext.getBean(ProductService.class);
        ProductService service1 = applicationContext.getBean("productService",ProductService.class);
        Assertions.assertSame(service1,service);

    }

    @Test
    void testConstructorDependencyInjection() {
        ProductService service = applicationContext.getBean(ProductService.class);
        ProductRepository repository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(repository,service.getRepository());
    }

    @Test
    void testSetterDependencyInjection() {
        CategoryRepository repository = applicationContext.getBean(CategoryRepository.class);
        CategoryService service = applicationContext.getBean(CategoryService.class);

        Assertions.assertSame(repository,service.getCategoryRepository());
    }
}
