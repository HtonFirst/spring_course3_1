package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()
@Scope("singleton")
public class Dog_1 implements Pet {
    @PostConstruct
    public void init() {
        System.out.println("Class Dog_1: init method");
    }


    public Dog_1() {
        System.out.println("Dog_1 is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog_1: destroy method");
    }
}
