package org.jt.gretting;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Gretting {
    public void greet() {
        System.out.println("Hello, Spring");
    }
}
