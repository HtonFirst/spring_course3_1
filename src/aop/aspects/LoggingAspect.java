package aop.aspects;

import aop.Book;
import aop.UniLibrary;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {


//    @Pointcut ("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsUniLibrary() {}
//
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsUniLibrary() {}
//
//    @Pointcut("allReturnMethodsUniLibrary() || allGetMethodsUniLibrary()")
//    public void allGetAndReturnMethodsUniLibrary(){}
//
//    @Pointcut ("execution(* aop.UniLibrary.*(..))")
//    public void allMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    public void MethodOnlyForReturnMagazine() {}
//
//    @Pointcut("allMethodsFromUniLibrary() && !MethodOnlyForReturnMagazine()")
//    public void allMethodsUniLibraryExceptReturnMagazine() {}
//
//
//
//
//    @Before("allGetMethodsUniLibrary()")
//    public void beforeGetMethodsLoggingAdvice() {
//        System.out.println("beforeGetMethodLoggingAdvice: writing log #1");
//    }
//    @Before("allReturnMethodsUniLibrary()")
//    public void beforeReturnMethodsLoggingAdvice() {
//        System.out.println("beforeReturnMethodLoggingAdvice: writing log #2");
//    }
//
//    @Before("allGetAndReturnMethodsUniLibrary()")
//    public void beforeGetAndReturnMethodsLoggingAdvice() {
//        System.out.println("beforeGetAndReturnMethodsLoggingAdvice: writing log #3");
//    }
//    @Before("allMethodsUniLibraryExceptReturnMagazine()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing log #4");
//    }







//    @Before("aop.aspects.MyPointCuts.allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: Logging of try to get book/magazine");
//        System.out.println("---------------------------------------------");
//    }

//    @Before("execution(* return*())")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: Try to return book");
//    }

    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getName = " + methodSignature.getName());
        System.out.println("methodSignature.getReturnType = " + methodSignature.getReturnType());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arsArray = joinPoint.getArgs();
            for (Object o:arsArray) {
                if (o instanceof Book) {
                    Book book = (Book) o;
                    System.out.println(String.format("BookName - %s, Author - %s, YearOfPublication - %d",
                            book.getName(), book.getAuthor(),book.getYearOfPublication()));
                } else if (o instanceof String) {
                    System.out.println("This book added by " + (String)o);
                }

            }
        }
        System.out.println("beforeAddLoggingAdvice: Logging of try to add book/magazine");
        System.out.println("---------------------------------------------");
    }





}


