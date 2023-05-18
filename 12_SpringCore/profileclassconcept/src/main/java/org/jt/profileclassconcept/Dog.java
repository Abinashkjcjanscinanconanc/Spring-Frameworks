package org.jt.profileclassconcept;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("UAT")
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

}
