package com.company.spring.basics.springsteps.xml;

public class XMLPersonDAO {

    XMLJdbcConnection XMLjdbcConnection;

    public XMLJdbcConnection getXMLJdbcConnection() {
        return XMLjdbcConnection;
    }

    public void setXMLJdbcConnection(XMLJdbcConnection jdbcConnection) {
        this.XMLjdbcConnection = jdbcConnection;
    }
}
