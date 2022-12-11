package org.hobby;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    @Pointcut("within(org..*)")
    public void authenticatingPointCut(){}

    @Pointcut("within(org.hobby.MedicalShoppingCart.*)")
    public void authorizingPointCut(){}

    @Before("authenticatingPointCut() && authorizingPointCut()")
    public void authenticate(){
        System.out.println("Authenticating request");
    }

}
