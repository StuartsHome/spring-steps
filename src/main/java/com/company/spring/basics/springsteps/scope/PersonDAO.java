package com.company.spring.basics.springsteps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component

public class PersonDAO {

    @Autowired
    JdbcConnection jdbcConnecction;

    public JdbcConnection getJdbcConnecction() {
        return jdbcConnecction;
    }

    public void setJdbcConnecction(JdbcConnection jdbcConnecction) {
        this.jdbcConnecction = jdbcConnecction;
    }
}
