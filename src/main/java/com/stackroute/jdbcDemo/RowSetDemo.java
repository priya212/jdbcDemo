package com.stackroute.jdbcDemo;

import com.sun.rowset.JdbcRowSetImpl;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class RowSetDemo {
    public void getAllStudents()
    {
        try {
            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            JdbcRowSet rowSet=new JdbcRowSetImpl();
            rowSet.setUrl("jdbc:mysql://localhost:3306/abc");
            rowSet.setUsername("root");
            rowSet.setPassword("Root@123");
            rowSet.setCommand("select * from course");
            rowSet.execute();
            rowSet.beforeFirst();
            while (rowSet.next()) {
                int id = rowSet.getInt(1);
                String name = rowSet.getString(2);
                int duration = rowSet.getInt(3);
                System.out.println(id + " " + name + " " + duration);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception Thrown "+ e.getStackTrace());
        }
    }

    public void getCourseByName(String name)
    {

    }
    public void getCourseByNameAndDuration(String name,int duration)
    {

    }
}
