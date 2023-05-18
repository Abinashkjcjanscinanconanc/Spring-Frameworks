package org.jt.profileclassconcept;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ "PROD", "default" })
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

}
