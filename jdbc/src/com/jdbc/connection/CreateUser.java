package com.jdbc.connection;
import java.sql.*;

public class CreateUser {
   public static void main(String[] args) {
      String url = "jdbc:mysql://localhost:3306/java";
      String user = "root";
      String password = "Dhaya004@";
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection(url, user, password);
         Statement st = con.createStatement();
        
         String sql = "CREATE USER 'Dhaya'@'Java' IDENTIFIED WITH mysql_native_password BY 'Dhaya004@'";
         st.execute(sql);
         System.out.println("User 'Dhaya' created successfully...!");
      }catch(Exception e) {
         e.printStackTrace();
      }
   }
}