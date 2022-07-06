package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        Dog youreDog = context.getBean("myPet", Dog.class);
        youreDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(youreDog.getName());

        System.out.println(myDog == youreDog);



        context.close();



    }
}
