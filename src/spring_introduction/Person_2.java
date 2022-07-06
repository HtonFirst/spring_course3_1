package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Person_2 {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public void setSurname(String surname) {
        System.out.println("Setting surname");
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setting age");
        this.age = age;
    }

    public Person_2(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }

    public Person_2() {
        System.out.println("Person is created without constructor");
    }
//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Pet injected in class Person");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet!");
        pet.say();
    }

}
