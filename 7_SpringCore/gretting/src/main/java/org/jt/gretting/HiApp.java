package org.jt.gretting;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class HiApp {
    public void hi() {
        System.out.println("Hi, Spring");
    }
}
