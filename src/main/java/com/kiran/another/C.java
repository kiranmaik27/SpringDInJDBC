package com.kiran.another;

import com.kiran.springexample.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

/**
 * Created by aditya on 9/15/2016.
 */

@Component
public class C {

    @Autowired
    private A a;

    public void checkBALive(){ a.checkBAlive();}

    @PostConstruct
    public void init() { Assert.notNull(a);    }

}
