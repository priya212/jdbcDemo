package com.stackroute;

import com.stackroute.jdbcDemo.DataManager;
import com.stackroute.jdbcDemo.DatabaseMetaDataDemo;
import com.stackroute.jdbcDemo.JdbcBatchProcessingDemo;
import com.stackroute.jdbcDemo.PreparedStatementDemo;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("---Using Statement---");
        DataManager dataManager=new DataManager();
        dataManager.getAllStudents();
        System.out.println("---Using Prepared Statement---");
        PreparedStatementDemo preparedStatementDemo=new PreparedStatementDemo();
        System.out.println("Get Course By name");
        preparedStatementDemo.getCourseByName("angular");
        System.out.println("Get Course By name and duration");
        preparedStatementDemo.getCourseByNameAndDuration("spring",4);
        /*System.out.println("---Using add batch---");
        JdbcBatchProcessingDemo jdbcBatchProcessingDemo=new JdbcBatchProcessingDemo();
        jdbcBatchProcessingDemo.usingBatchProcessing();
        dataManager.getAllStudents();*/

        System.out.println("---Database MetaData---");
        DatabaseMetaDataDemo databaseMetaDataDemo=new DatabaseMetaDataDemo();
        databaseMetaDataDemo.getDatabaseMetaData();
    }
}
