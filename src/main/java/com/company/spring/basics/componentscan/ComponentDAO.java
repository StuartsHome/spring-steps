package com.company.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ComponentDAO {

    @Autowired
    ComponentJdbcConnection jdbcConnection;

    public ComponentJdbcConnection getJdbcConnecction() {
        return jdbcConnection;
    }

    public void setComponentJdbcConnecction(ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}
