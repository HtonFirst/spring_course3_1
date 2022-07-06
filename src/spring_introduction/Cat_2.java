package spring_introduction;

import org.springframework.stereotype.Component;


public class Cat_2 implements Pet {

    public Cat_2() {
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
