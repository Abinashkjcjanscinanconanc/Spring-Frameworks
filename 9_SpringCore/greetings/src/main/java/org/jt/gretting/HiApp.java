package org.jt.gretting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HiApp {


    private Employee employee;

    public HiApp(Employee employee) {
        this.employee = employee;
//        employee.getName();
    }

//    @Autowired
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
    public void hi() {
        System.out.println("Hi, Spring");
        System.out.println(employee.getName());
    }
}
