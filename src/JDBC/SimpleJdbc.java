package JDBC;

import java.sql.*;

public class SimpleJdbc {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/testdb";
        String root="root";
        String password="root";

        try(Connection connection = DriverManager.getConnection(url,root,password);
            Statement stmt=connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from students");)
        {
            while(resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                System.out.println(id+" - "+name);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
