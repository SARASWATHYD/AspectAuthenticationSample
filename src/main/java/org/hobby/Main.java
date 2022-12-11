package org.hobby;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(BeanConfig.class);
        MedicalShoppingCart cart = context.getBean(MedicalShoppingCart.class);
        cart.checkout("CANCELLED");
        System.out.println("Hello world!");
    }
}