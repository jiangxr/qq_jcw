package com.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by jiangchangwei on 2017/5/18.
 */
public class SQLHelper {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/qq_jcw?useSSL=false&useCharacterEncoding=UTF8";
    private static String username="jcw-testing";
    private static String password="jcw-testing";
//    Logger logger = LoggerFactory.getLogger(SQLHelper.class);
    static {
        try {
            Properties properties = new Properties();
//            InputStream in = SQLHelper.class.getResourceAsStream("sql.properties");
            String path = System.getProperty("user.dir") + "/web/resources/sql.properties";
            File file = new File(path);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                properties.load(fis);
                if (properties.getProperty("driver") != null) {
                    driver = (String) properties.getProperty("driver");
                }
                if (properties.getProperty("url") != null) {
                    url = (String) properties.getProperty("url");
                }
                if (properties.getProperty("username") != null) {
                    username = (String) properties.getProperty("username");
                }
                if (properties.getProperty("password") != null) {
                    password = (String) properties.getProperty("password");
                }
            }
            Class.forName(driver);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() {
//        logger.info("driver:{}, url:{}, username:{}, password:{}", driver, url, username, password);
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection conn = SQLHelper.getConnection();
        if(conn != null)
            System.out.println("connection success");
        else
            System.out.println("connection failure");
    }
}
