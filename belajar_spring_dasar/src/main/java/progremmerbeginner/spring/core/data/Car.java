package progremmerbeginner.spring.core.data;

import lombok.Getter;
import progremmerbeginner.spring.core.Awer.IdAware;

public class Car implements IdAware {
    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
