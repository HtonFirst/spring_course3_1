package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog_1 myDog = context.getBean("dog_1", Dog_1.class);
        Dog_1 yourDog = context.getBean("dog_1", Dog_1.class);

        myDog.say();

        System.out.println(myDog == yourDog);

        System.out.println(myDog);
        System.out.println(yourDog);




        context.close();


    }
}
