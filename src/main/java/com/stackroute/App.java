package com.stackroute;

import com.stackroute.jdbcDemo.*;


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
        System.out.println("---ResultSet MetaData---");
        ResultSetMetaDataDemo resultSetMetaDataDemo=new ResultSetMetaDataDemo();
        resultSetMetaDataDemo.getResultSetMetaData();
        System.out.println("---Jdbc Transaction---");
        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        jdbcTransactionDemo.jdbcTransaction();
        System.out.println("Row deleted");
        // System.out.println("Saves DML change");
        System.out.println("---Using rowset---");
        RowSetDemo rowSetDemo=new RowSetDemo();
        //rowSetDemo.getAllStudents();
        //rowSetDemo.getCourseByName("j2ee");
    }
}
