package com.kiran.springexample;

/**
 * Created by aditya on 9/15/2016.
 */
import com.kiran.another.C;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class B{
    String var ="Jackepot";
/*
public class B implements ApplicationContextAware{

   private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
*/

    public void execute(){
            System.out.println("Kiran B");
        }
     //   A a = (A) applicationContext.getBean("A");
       // a.checkViaC();


}
