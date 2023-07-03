package progremmerbeginner.spring.core.Listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import progremmerbeginner.spring.core.EVENT.LoginSuccessEvent;

@Slf4j
@Component
public class LoginAgainSuccessListener implements ApplicationListener <LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("success login again for user {}",event.getUser());
    }
}
