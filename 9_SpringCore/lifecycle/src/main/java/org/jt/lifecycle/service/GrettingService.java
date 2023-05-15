package org.jt.lifecycle.service;

import org.springframework.stereotype.Service;

@Service
public class GrettingService {
    public GrettingService() {
        System.out.println("GrettingService Constructor called");
    }
}
