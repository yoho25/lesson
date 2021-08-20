package com.sylink.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAop {
    @Before("within(com.sylink.controller.sample1.*)")
    public void before(JoinPoint jp){
        System.out.println("コード（001）：Before-" + jp.getSignature().getName());
    }

    @Around("execution(public String com.sylink.controller.sample2..*(..))")
    public Object executionAround(ProceedingJoinPoint joinPoint) throws Throwable{
        String name = joinPoint.getSignature().getName();
        try {
            // 授权
            System.out.println("コード（002）：execution-Around-Before-" + name);
            Object [] args = joinPoint.getArgs();
            System.out.println(args[0].toString());
            Object object = joinPoint.proceed();
            System.out.println("コード（003）：execution-Around-After-" + name);
            return object;
        } catch (Exception e) {
            System.out.println("コード（004）：execution-Around-Exception-" + name);
            e.printStackTrace();
            throw e;
        }
    }
}
