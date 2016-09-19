package com.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;


/**
 * Created by aditya on 9/19/2016.
 */
public interface PersonMapper {

    Person getById(@Param("id") Long id);
    List<Person> all();

    void newPerson(@Param("person") Person person);
}
