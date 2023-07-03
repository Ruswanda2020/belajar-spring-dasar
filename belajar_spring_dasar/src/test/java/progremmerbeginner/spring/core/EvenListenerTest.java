package progremmerbeginner.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import progremmerbeginner.spring.core.Listener.LoginAgainSuccessListener;
import progremmerbeginner.spring.core.Listener.LoginSuccessListener;
import progremmerbeginner.spring.core.service.UserService;

public class EvenListenerTest {
    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class
    })
   public static class TestConfiguration{


    }
     private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }

    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("wanda","wanda");
        userService.login("wada","wanda");
    }
}