package com.ytinf.test.database;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;

public class DatabaseConnectionDemoA {
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver" ;
    public static final String DBURL = "jdbc:mysql://localhost:3306/lee" ;
    public static final String USERNAME = "root" ;
    public static final String PASSWORD = "mysqladmin" ;
    public static void main(String[] args) throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource() ;
        dataSource.setDriverClassName(DBDRIVER);
        dataSource.setUrl(DBURL);
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);
        // 所有的DataSource接口实例都可以直接获取Connection接口实例
        Connection connection = dataSource.getConnection() ;
        System.out.println(connection);
        connection.close(); // 关闭连接
    }
}
