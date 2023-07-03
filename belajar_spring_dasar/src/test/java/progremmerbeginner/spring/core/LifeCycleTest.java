package progremmerbeginner.spring.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import progremmerbeginner.spring.core.data.Connection;
import progremmerbeginner.spring.core.data.Server;

public class LifeCycleTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @Test
    void testConnection() {
        Connection connection =context.getBean(Connection.class);
    }
    @AfterEach
    void tearDown() {
        context.close();
    }

    @Test
    void testServer() {
        Server server = context.getBean(Server.class);
    }
}


