package com.kiran;

import com.kiran.springexample.A;
import com.kiran.springexample.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by aditya on 9/16/2016.
 */

@Configuration
public class SpringAnnotate {

    @Bean
    public B b() { return new B(); }

    @Bean
    public A a() {
        A a = new A();
        a.setB(b());
        return a;
    }
}
