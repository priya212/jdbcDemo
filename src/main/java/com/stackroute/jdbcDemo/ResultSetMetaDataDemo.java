package com.stackroute.jdbcDemo;

import java.sql.*;

public class ResultSetMetaDataDemo {
    public void getResultSetMetaData()
    {
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Root@123");
             Statement statement=connection.createStatement();
             ResultSet resultSet=statement.executeQuery("select * from course");){
            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
           /* Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Root@123");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from course");
           */ ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
            System.out.println("No of columns : "+resultSetMetaData.getColumnCount());
            System.out.println("Column 1 Name : "+resultSetMetaData.getColumnName(1));
            System.out.println("Datatype of 2 column : "+resultSetMetaData.getColumnTypeName(2));
            System.out.println("Label of 3 column : "+resultSetMetaData.getColumnLabel(3));

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception Thrown"+ e.getStackTrace());
        }
    }
}
