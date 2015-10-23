package demo.newWay;

import demo.ServiceInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

    private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class);

    @Around("execution(* demo.newWay.ServiceInterfaceImplNewWay.doThings(..))")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {

        final Signature signature = pjp.getSignature();

        LOGGER.info("Start {}.{}()", signature.getDeclaringTypeName(), signature.getName());

        final Object result = pjp.proceed();

        LOGGER.info("End {}.{}()", signature.getDeclaringType(), signature.getName());

        return result;
    }
}
