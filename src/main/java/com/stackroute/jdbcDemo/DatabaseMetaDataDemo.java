package com.stackroute.jdbcDemo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetaDataDemo {
    public void getDatabaseMetaData()
    {
        Connection connection=null;
        try {
            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Root@123");
            DatabaseMetaData databaseMetaData=connection.getMetaData();

            System.out.println("Driver Name : "+databaseMetaData.getDriverName());
            System.out.println("Driver Version Name : "+databaseMetaData.getDriverVersion());
            System.out.println("UserName is : "+databaseMetaData.getUserName());
            System.out.println("Database Product Name : "+databaseMetaData.getDatabaseProductName());
            System.out.println("Database Product Version : "+databaseMetaData.getDatabaseProductVersion());
            System.out.println("JDBC Major Version : "+databaseMetaData.getJDBCMajorVersion());
            System.out.println("URL : "+databaseMetaData.getURL());
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception Thrown"+ e.getStackTrace());
        }
        finally {
            try {
                if(connection != null ) {
                    connection.close();;
                }
            }catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
