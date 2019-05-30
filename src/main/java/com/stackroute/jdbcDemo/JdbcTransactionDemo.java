package com.stackroute.jdbcDemo;

import java.sql.*;

public class JdbcTransactionDemo {
    public void jdbcTransaction()
    {
        //register driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Root@123");
            connection.setAutoCommit(false);
            Statement statement=connection.createStatement();
            int count=statement.executeUpdate("insert into course value(12,'Java',7)");
            System.out.println(count+" row inserted");
            // delete the latest DML change
            connection.rollback();
            // saves the latest DML change
            connection.commit();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }
}
