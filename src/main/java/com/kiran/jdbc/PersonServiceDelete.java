package com.kiran.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by aditya on 9/18/2016.
 */
public class PersonServiceDelete extends JdbcDaoSupport{

    public void deletePerson(){

        String SQL = "delete from person where id = ?";
        getJdbcTemplate().update(SQL, 1L);
        System.out.println("Deleted Record Name = " + "Naveen");

    }

}
