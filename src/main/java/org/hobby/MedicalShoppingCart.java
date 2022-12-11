package org.hobby;

import org.springframework.stereotype.Component;

@Component
public class MedicalShoppingCart {
    public void checkout(String status){
        System.out.println("checking out medicines");
    }

    public int quantity(){
        return 2;
    }

}
