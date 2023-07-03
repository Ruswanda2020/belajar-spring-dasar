package progremmerbeginner.spring.core.Processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import progremmerbeginner.spring.core.Awer.IdAware;

import java.util.UUID;

@Component
@Slf4j
public class PrefixGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info(" prefix id generator processor for bean {}",beanName);
        if (bean instanceof IdAware){
            log.info("prefix set id generatore for bean {}",beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("prefix-" + idAware.getId());
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
