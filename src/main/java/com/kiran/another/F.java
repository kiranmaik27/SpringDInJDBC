package com.kiran.another;

import com.kiran.springexample.A;
import org.springframework.stereotype.Component;

/**
 * Created by aditya on 9/15/2016.
 */
@Component
public class F {

    private A a;

    public  void check(){ System.out.println("Test");}

    public static void main (String[] args){
        F f = new F();
    }
}
