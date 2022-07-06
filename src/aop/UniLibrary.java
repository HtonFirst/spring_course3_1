package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

 //   @Override
    public void getBook() {
        System.out.println(String.format("I take a book from UniLibrary"));
        System.out.println("---------------------------------------------");
    }

    public void returnBook() {
        System.out.println("I return book to UniLibrary");
        System.out.println("---------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("I take a magazine from UniLibrary");
        System.out.println("---------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("I return magazine to UniLibrary");
        System.out.println("---------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println(String.format("I add %s to UniLibrary", book.getName()));
        System.out.println("---------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("I add magazine to UniLibrary");
        System.out.println("---------------------------------------------");
    }

}
