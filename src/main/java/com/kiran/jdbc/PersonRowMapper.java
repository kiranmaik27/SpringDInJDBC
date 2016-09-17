package com.kiran.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by aditya on 9/17/2016.
 */
public class PersonRowMapper implements RowMapper<Person> {

    public Person mapRow(ResultSet rs, int rowNum) throws SQLException{
        Person p = new Person();
        p.setFirstname(rs.getString("firstname"));
        p.setId(rs.getLong("id"));
        return p;
    }
}
