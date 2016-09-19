package com.kiran.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcInsertOperations;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.util.StreamUtils;

import java.sql.Connection;

/**
 * Created by aditya on 9/17/2016.
 */
public class PersonServiceInsert extends JdbcDaoSupport {

    public void setPerson(){

        String SQL = "insert into person (id, first_name) values (?,?)";

        getJdbcTemplate().update(SQL,3L,"Praneel");
        System.out.println("Created Record Name = " + "Praneel");
        return;

    }
}
