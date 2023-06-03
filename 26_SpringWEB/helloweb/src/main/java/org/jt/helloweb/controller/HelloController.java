package org.jt.helloweb.controller;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloController
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    void helloWorld(PrintWriter printWriter) {
        printWriter.println("Hello Web");
    }
}
