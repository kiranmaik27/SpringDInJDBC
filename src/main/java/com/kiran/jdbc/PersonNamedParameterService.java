package com.kiran.jdbc;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aditya on 9/17/2016.
 */
public class PersonNamedParameterService extends NamedParameterJdbcDaoSupport {

    public Person getPerson(Long id) {

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("id", id);

        String SQL = "select Id as id, first_name as firstname from Person where id=:Id";

        Person person = getNamedParameterJdbcTemplate().queryForObject
                (SQL, paramMap, new PersonRowMapper());
        return person;
    }
}
