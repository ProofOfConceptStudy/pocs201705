package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import aop.service.ServiceBase;

@Aspect
@Component
public class ServiceLogInterceptor {
    private final Logger logger;

    public ServiceLogInterceptor(){
        this.logger = LoggerFactory.getLogger(ServiceBase.class);
    }

    @Before("execution(* aop.service..ServiceBase.execute(..))")
    public void invokeBefore(JoinPoint joinPoint) {
        methodLog(joinPoint.getTarget().getClass().toString(), joinPoint.getSignature().getName(), "<<< start >>>");
    }

    @After("execution(* aop.service..ServiceBase.execute(..))")
    public void invokeAfter(JoinPoint joinPoint) {
        methodLog(joinPoint.getTarget().getClass().toString(), joinPoint.getSignature().getName(), "<<< end >>>");
    }

    private void methodLog(String className, String methodName, String message){
        logger.info(className + "." + methodName + "() " + message + ".");
    }
}
