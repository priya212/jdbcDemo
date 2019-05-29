package com.stackroute;

import com.stackroute.jdbcDemo.DataManager;
import com.stackroute.jdbcDemo.PreparedStatementDemo;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Using Statement");
        DataManager dataManager=new DataManager();
        dataManager.getAllStudents();
        System.out.println("---Using Prepared Statement---");
        PreparedStatementDemo preparedStatementDemo=new PreparedStatementDemo();
        System.out.println("Get Course By name");
        preparedStatementDemo.getCourseByName("angular");
        System.out.println("Get Course By name and duration");
        preparedStatementDemo.getCourseByNameAndDuration("spring",4);
    }
}
