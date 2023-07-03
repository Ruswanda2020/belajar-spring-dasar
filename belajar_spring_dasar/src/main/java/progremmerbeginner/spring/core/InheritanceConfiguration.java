package progremmerbeginner.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import progremmerbeginner.spring.core.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
}
