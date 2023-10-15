package com.ssm.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {

    public void afterPrintLog() {
        System.out.println("afterPrintLog");
    }
    public Object aroundPrintLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aroundPrintLog");
        Object result;
        System.out.println(pjp);
            Object[] args = pjp.getArgs();
            result = pjp.proceed(args);
            return result;
    }
}
