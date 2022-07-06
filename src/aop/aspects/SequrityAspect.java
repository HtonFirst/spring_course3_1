package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SequrityAspect {

//    @Before("aop.aspects.MyPointCuts.allGetMethods()")
//    public void beforeGetSequrityAdvice() {
//        System.out.println("beforeGetSequrityAdvice: access checking");
//        System.out.println("---------------------------------------------");
//    }

    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddSequrityAdvice() {
        System.out.println("beforeAddSequrityAdvice: access checking");
        System.out.println("---------------------------------------------");
    }
}
