package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
 //   @Override
    public void getBook() {
        System.out.println("I take a book from SchoolLibrary");
    }
}
