package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6_1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig_2.class);

       Pet cat = context.getBean("catBean", Cat_2.class);
       cat.say();

       Person_2 person = context.getBean("personBean", Person_2.class);
       person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());



       context.close();


    }
}
