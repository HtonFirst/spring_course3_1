package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {


    @Before("execution(* getStudents())")
    public void beforeGetStudentsAdvice() {
        System.out.println("beforeGetStudentsAdvice: Logging getting studentList before method" +
                " getStudents");
        System.out.println("--------------------------------");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
    returning = "students")
    public void afterReturningGetStudentsAdvice(List<Student> students) {

        Student firstStudent = students.get(0);
        String newName = "Mr. " + firstStudent.getNameSurname();
        firstStudent.setNameSurname(newName);

        Double newAvgGrade = 0.1 + firstStudent.getAvgGrade();
        firstStudent.setAvgGrade(newAvgGrade);


        System.out.println("afterReturningGetStudentsAdvice: Logging getting studentList after method" +
                " getStudents");
        System.out.println("--------------------------------");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsAdvice: Logging throwing of exception, method" +
                " getStudents " + exception);
        System.out.println("--------------------------------");
    }
    @After("execution(* getStudents())")
    public void afterFinallyGetStudentsAdvice() {
        System.out.println("afterFinallyGetStudentsAdvice: Logging finnaly ending method " +
                "getStudents");
    }
}
