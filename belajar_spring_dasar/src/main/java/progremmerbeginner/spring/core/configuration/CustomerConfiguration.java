package progremmerbeginner.spring.core.configuration;

import org.springframework.context.annotation.Configuration;
import progremmerbeginner.spring.core.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {

    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    }
    public CustomerRepository premiumCustomerRepository(){
        return new CustomerRepository();
    }
}
