package com.dao;

import com.util.SQLHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jiangchangwei on 2017/5/18.
 */
public class LoginDAO {

    public boolean isUser(String username, String password) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
           conn = SQLHelper.getConnection();
           String stmt = "select * from user where username = ?";
           ps = conn.prepareStatement(stmt);
           ps.setString(1, username);
           rs = ps.executeQuery();
           if(!rs.next()) {
               return false;
           }else {
               String pwd = rs.getString("password");
               return password.equals(pwd);
           }
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            if(rs != null)
                rs.close();
            if(ps != null)
                ps.close();
        }
    }
}
