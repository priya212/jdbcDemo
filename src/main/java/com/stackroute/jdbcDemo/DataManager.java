package com.stackroute.jdbcDemo;

import java.sql.*;

public class DataManager {
public void getAllStudents()
{
    Connection connection=null;
    Statement statement=null;
    ResultSet resultSet=null;
    try{
        //register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //obtain connection
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Root@123");
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select * from course");
        //in reverse order
        /*resultSet.afterLast();
        while(resultSet.previous()){
            int id=resultSet.getInt(1);
            String name=resultSet.getString(2);
            int duration=resultSet.getInt(3);
            System.out.println(id+ " "+name+" "+duration);
        }*/
        while(resultSet.next()) {
            int id=resultSet.getInt(1);
            String name=resultSet.getString(2);
            int duration=resultSet.getInt(3);
            System.out.println(id+ " "+name+" "+duration);
        }

    } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Exception Thrown"+ e.getStackTrace());
    }
    finally {
            try {
                if(connection != null || statement != null || resultSet != null) {
                    connection.close();
                    statement.close();
                    resultSet.close();;
                }
            }
            catch (SQLException e) {
                System.out.println(e);
            }
    }
}
}
