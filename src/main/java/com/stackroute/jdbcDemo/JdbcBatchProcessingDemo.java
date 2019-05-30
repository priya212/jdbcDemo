package com.stackroute.jdbcDemo;

import java.sql.*;

public class JdbcBatchProcessingDemo {
    public void usingBatchProcessing()
    {
        try ( Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Root@123");
              Statement statement=connection.createStatement();){
            Class.forName("com.mysql.cj.jdbc.Driver");
           /* Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Root@123");
            Statement statement=connection.createStatement();
           */ statement.addBatch("insert into course values(14,'hibernate',3)");
            statement.addBatch("insert into course values(15,'web Tech',1) ");
            int[] batch=statement.executeBatch();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
