package com.kiran.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by aditya on 9/15/2016.
 */

@Component
public class A {

    private B b; //collaborator

    @Autowired
    public void setB(B b){
        this.b = b;
         System.out.println("Hello Geetha in SETB()"+ b.var);
    }

    public void checkBAlive() { b.execute(); }

   // public void checkViaC() { System.out.println("C");}

}
