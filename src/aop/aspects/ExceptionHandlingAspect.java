package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

//    @Before("aop.aspects.MyPointCuts.allGetMethods()")
//    public void beforeGetExceptionHandlingAdvice() {
//        System.out.println(
//                "beforeGetExceptionHandlingAdvice:" +
//                        " Catching exception when trying get book/magazine");
//        System.out.println("---------------------------------------------");
//    }

    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println(
                "beforeAddExceptionHandlingAdvice:" +
                        " Catching exception when trying add book/magazine");
        System.out.println("---------------------------------------------");
    }
}
