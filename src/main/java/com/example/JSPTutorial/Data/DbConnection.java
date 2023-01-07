package com.example.JSPTutorial.Data;

import com.example.JSPTutorial.Controllers.Account;

import java.sql.*;
import java.util.ArrayList;

public class DbConnection {
    private static String stringConnection = "jdbc:sqlserver://localhost:1433;databaseName=jspservlet;integratedSecurity=false;encrypt=false;";
    private static String username = "sa";
    private static String password = "abc@123";

    public static Connection instance;

    public static Connection getInstance() {
        if(instance == null)
        {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                instance =  DriverManager.getConnection(stringConnection, username, password);
                if(instance != null)
                {
                    System.out.println("Connected!");
                }
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Connect Failed with Error: " + e.toString());
                e.printStackTrace();
            }
        }
        return instance;
    }


    public static ArrayList<Account> executeQuery(String query)
    {
        try
        {
            ArrayList<Account> accounts = new ArrayList<>();

            PreparedStatement preparedStatement = instance.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setUsername(resultSet.getString("username"));
                account.setPassword(resultSet.getString("pass"));
                accounts.add(account);
            }
            return accounts;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;

        }
    }
}
