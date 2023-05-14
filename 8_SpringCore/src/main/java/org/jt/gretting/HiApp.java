package org.jt.gretting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HiApp {

    @Autowired
    private Employee employee;
    public void hi() {
        System.out.println("Hi, Spring");
        System.out.println(employee.getName());
    }
}
