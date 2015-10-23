package demo.newWay;

import demo.ServiceInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class ProfilingAspect {

    private static final Logger LOGGER = LogManager.getLogger(ProfilingAspect.class);

    @Around("target(demo.newWay.ServiceInterfaceImplNewWay) && !within(java.lang.Object)")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {

        final Signature signature = pjp.getSignature();

        long start = System.currentTimeMillis();

        final Object result = pjp.proceed();

        LOGGER.info("{}.{}() took {}ms", signature.getDeclaringTypeName(), signature.getName(), System.currentTimeMillis() - start);

        return result;
    }

}
