package com.kiran.springexample;

import com.kiran.jdbc.Person;
import com.kiran.jdbc.PersonNamedParameterService;
import com.kiran.jdbc.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by aditya on 9/16/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/springjdbc.xml"})
public class  jdbc {

    @Autowired
    private PersonService personService;

    @Autowired
    @Qualifier("personNamedService")
    private PersonNamedParameterService personNamedParameterService;

    @Test
    public void getbyId(){
        String name = personService.getPerson(1L);
        System.out.println(name);
        Assert.notNull(name);
    }

    @Test
    public void getbyIDNamedParameter(){
        Person p = personNamedParameterService.getPerson(1L);
        System.out.println(p.getFirstname());
    }
}
