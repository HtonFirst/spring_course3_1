package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

    @Pointcut("execution(* cccget*())")
    public void allGetMethods() {}

    @Pointcut("execution(* cccadd*(..))")
    public void allAddMethods() {}
}
