package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4_1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2_1.xml");

        Dog_1 myDog = context.getBean("myPet", Dog_1.class);
        myDog.say();

        Dog_1 youreDog = context.getBean("myPet", Dog_1.class);
        youreDog.say();

        context.close();



    }
}
