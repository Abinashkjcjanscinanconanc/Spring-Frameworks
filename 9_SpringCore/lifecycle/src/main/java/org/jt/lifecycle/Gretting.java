package org.jt.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Gretting {
    private String name = getName();
    public  Gretting() {
        System.out.println("Gretting Object constructed");
    }

    @PostConstruct
   public void init() {
        System.out.println("init called");
    }

    public void gretting() {
        System.out.println("Hello, spring");
    }

    public void setName(String name) {
        System.out.println("set name execute");
        this.name = name;
    }

    private String getName() {
        System.out.println("Get name execute");
        return "Smruti";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy called");
    }
}
