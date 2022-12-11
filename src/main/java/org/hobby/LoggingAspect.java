package org.hobby;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.hobby.MedicalShoppingCart.checkout(..))") // will execute this logginng before
    public void beforeLogger(JoinPoint jp){
//        System.out.println(jp.getSignature());
        String ar = jp.getArgs()[0].toString();
        System.out.println("before loggers::"+ar);
    }

    @After("execution(* org.hobby.MedicalShoppingCart.checkout(..))") // will execute this logginng before
    public void afterLogger(){
        System.out.println("After loggers");
    }
    @Pointcut("execution(* org.hobby.MedicalShoppingCart.quantity(..))")
    public void afterReturningPointCut(){}


    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After returning");
    }
}
