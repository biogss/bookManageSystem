package com.example.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName controllerAOP
 * @Description aop测试类
 * @Author wangHao
 * @DATE 2020/4/29 23:32
 * @Version 1.0
 */
@Aspect
@Component
public class controllerAOP {

    private final Logger logger = LoggerFactory.getLogger(controllerAOP.class);

    @Pointcut("execution(public * com.example.controller..*.*(..))")
    public void controllerLog(){}


    @Before("controllerLog()")
    public void logBefore(JoinPoint joinPoint) {
        Object[] objects = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        for (int i = 0; i< objects.length; i++) {
            logger.info("执行controller方法："  + signature.getDeclaringTypeName() + "." +signature.getName() +
                    "|传入的参数为：" + objects[i].toString());
        }
    }

    @After("controllerLog()")
    public void logAfter(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        logger.info("controller方法："  + signature.getDeclaringTypeName() + "." +signature.getName() + "执行完成");
    }
    @Around("controllerLog()")
    public Object logAround(ProceedingJoinPoint point){
        logger.info("******************before");
        Object proceed = null;
        try {
            proceed = point.proceed();
        } catch (Throwable throwable) {
            logger.error(throwable.getMessage());
        }
        logger.info("*****************after");
        return proceed;
    }
}
