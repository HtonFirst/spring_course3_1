package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class Test3 {
    public static void main(String[] args) {

        System.out.println("Method Main Starts");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary_2 library = context.getBean("uniLibrary_2", UniLibrary_2.class);
        String bookName = "unknown Book's name";
        try {
            bookName   = library.returnBook();
        } catch (Exception e) {
            System.out.println("Method throwing " + e);
        }
        System.out.println(bookName);


        context.close();

        System.out.println("Method Main Ends");


    }
}
