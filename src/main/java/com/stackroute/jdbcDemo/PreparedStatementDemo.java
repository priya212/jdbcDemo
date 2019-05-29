package com.stackroute.jdbcDemo;

import java.sql.*;

public class PreparedStatementDemo {
    public void getCourseByName(String name)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Root@123");
            PreparedStatement preparedStatement=connection.prepareStatement("Select * from course where name=?");
            preparedStatement.setString(1,name);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int id=resultSet.getInt(1);
                String dbName=resultSet.getString(2);
                int duration=resultSet.getInt(3);
                System.out.println(id+ " "+name+" "+duration);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public void getCourseByNameAndDuration(String name,int duration)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Root@123");
            PreparedStatement preparedStatement=connection.prepareStatement("Select * from course where name=? and duration=?");
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,duration);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int id=resultSet.getInt(1);
                String dbName=resultSet.getString(2);
                int dDduration=resultSet.getInt(3);
                System.out.println(id+ " "+name+" "+duration);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
