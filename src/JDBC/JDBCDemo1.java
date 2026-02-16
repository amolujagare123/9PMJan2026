package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/school";

        Connection con = DriverManager.getConnection(url,username,password);

        // 3. creating a statement
        Statement st = con.createStatement();

        // 4. executing a query

        // DML - Data Manipulation language - insert , update & delete
        // DDL - Data Definition language - select , create , grant

        //String sql = "insert into student values(12,'sagar','IT',56)";
        //String sql = "update student set marks= 100 where id=12";
        String sql = "delete from student where id=12";

        st.executeUpdate(sql);


        // 5. close connections

        st.close();
        con.close();

    }

}
