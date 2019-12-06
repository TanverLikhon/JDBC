/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;

public class JDBC {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost/university";
        String uname = "root";
        String query = "select * from student_details";
      
        String pass = "";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        
        //updating query
          String Query ="INSERT into student_details\n" +
"VALUES(6795,'Biggboss',22,3.7,'Male','Dinajpur',1781949541,'CSE')";
        int count =st.executeUpdate(Query);///for updating
        //count returns number of rows update
System.out.println(count+" row/s updated");        
        ////printing table
      /*  while(rs.next())
        {
            System.out.println("Roll = "+rs.getInt(1)+" Name : "+rs.getString(2));
        }*/
        ///printing one query
       /* rs.next();
        String name = rs.getString(4);
        System.out.println(name);*/
       
       ///updating table
       

        st.close();
        con.close();
    }

}
