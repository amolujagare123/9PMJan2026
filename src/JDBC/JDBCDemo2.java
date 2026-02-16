package JDBC;

import java.sql.*;

public class JDBCDemo2 {

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

      
        String sql = "select * from student where branch like 'c%'";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }


        // 5. close connections

        st.close();
        con.close();

    }

}
