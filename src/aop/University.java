package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class University {

    List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("John Smith", 2, 4.7);
        Student st2 = new Student("Gary Moore", 4, 4.8);
        Student st3 = new Student("Peter Pen", 1, 3.9);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Starting method getStudent");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents");
        System.out.println(students);
        System.out.println("_________________________________");
        return students;
    }
}
