package org.jt.classprofileconcept;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats");
    }
}
