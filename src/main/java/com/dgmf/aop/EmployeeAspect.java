package com.dgmf.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/*
All the Methods inside this "EmployeeAspect" become
the "Advices"
*/
@Aspect
@Component
public class EmployeeAspect {
    /*
    In "EmployeeController", "Before" starting any Method with
    any Return Type and any Number of Parameters, Log it
    Pointcut expression ==> "execution(* com.dgmf.controller.EmployeeController.*(..))"
    Join point ==> the place where the Pointcut will be executed
     */

    // Advice ==> the entire Method
    // Pointcut Expression ==> the Annotation that links Advice to Joint Point
    // Pointcut Designator (PCD) ==> "execution"
    @Before(value = "execution(* com.dgmf.controller.EmployeeController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) { // JoinPoint ==> Positions
        // where the Advice will be applied
        System.out.println("Request to " + "\"" + joinPoint.getSignature() +
                "\"" + " started at : " + new Date());
    }
}
