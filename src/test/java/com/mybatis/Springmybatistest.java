package com.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by aditya on 9/19/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/Springmybatis.xml"})
public class Springmybatistest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void testPersonById(){
        Person p = personMapper.getById(2L);
        Assert.notNull(p);
    }
/*
    @Test
    public void testNewPerson(){
        Person p = new Person();
        p.setFirstname("Kiran");
        personMapper.newPerson(p);
    }
*/
}
