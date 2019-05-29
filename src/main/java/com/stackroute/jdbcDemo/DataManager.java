package com.stackroute.jdbcDemo;

import java.sql.*;

public class DataManager {
public void getAllStudents()
{

    try {
        //register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //obtain connection
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Root@123");
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from course");
        resultSet.afterLast();
        while(resultSet.previous())
        {
            int id=resultSet.getInt(1);
            String name=resultSet.getString(2);
            int duration=resultSet.getInt(3);
            System.out.println(id+ " "+name+" "+duration);
        }

    } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Exception Thrown"+ e.getStackTrace());
    }
}
}
