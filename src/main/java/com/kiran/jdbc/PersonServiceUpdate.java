package com.kiran.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by aditya on 9/18/2016.
 */
public class PersonServiceUpdate extends JdbcDaoSupport{
    public void setPerson() {

        String SQL = "update person set first_name = ? where id = ?";

        getJdbcTemplate().update(SQL, "Naveen", 1L);
        System.out.println("Updated Record Name = " + "Naveen");
        return;
    }
}
