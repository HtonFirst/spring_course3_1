package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public String aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws
            Throwable{
        System.out.println("aroundReturnBookAdvice: Logging try to returning book to library");
//
//        Long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("Method returnBook throuwing " + e + " was logging");
//            targetMethodResult = "unknown Book name";
            throw e;
        }


//        targetMethodResult = "Theatre";
//        Long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookAdvice:  returning book to library complit");
//        System.out.println("aroundReturnBookAdvice: time of rerurnBook execution is "
//         + (end - begin) + "ms");

        return (String) targetMethodResult;
    }
}
