package com.kiran.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by aditya on 9/16/2016.
 */
public class PersonService extends JdbcDaoSupport {

    public String getPerson(Long id) {

        String SQL = "select first_name as firstname from Person where Id=" + id;

        String person = getJdbcTemplate().queryForObject(SQL, String.class);

        return person;

    }
}
