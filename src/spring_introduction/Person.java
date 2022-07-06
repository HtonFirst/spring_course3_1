package spring_introduction;

public class Person {

    private Pet pet;
    private String surname;
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

    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person is created without constructor");
    }

    public void setPet(Pet pet) {
        System.out.println("Pet injected in class Person");
        this.pet = pet;
    }

    public void callYourePet() {
        System.out.println("Hello my lovely pet!");
        pet.say();
    }

}
