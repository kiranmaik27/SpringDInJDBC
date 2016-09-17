package com.kiran.springexample;

import com.kiran.SpringAnnotate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by aditya on 9/16/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringAnnotate.class})
public class SpringAnnotateTest {

    @Autowired
    private A a;

    @Autowired
    private B b;

    @Test
    public void checkA() {
        a.checkBAlive();
        System.out.println("A is alive");
    }

    @Test
    public void checkB() {b.execute();}
}
