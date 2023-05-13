package org.jt.gretting;

import org.springframework.stereotype.Component;

@Component
public class Gretting {
    public void greet() {
        System.out.println("Hello, Spring");
    }
}
