import org.testng.annotations.Test;

import java.sql.*;

@Test
public class GetDatabaseValues {
        public static void  main(String[] args) throws  ClassNotFoundException, SQLException {
            //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name" sample url
            String dbUrl = "jdbc:mysql://192.168.00.00:8080/FAKE_CAR_DATA.db";

            //Database Username
            String username = "kelvin";

            //Database Password
            String password = "kelvin";

            //Query to Execute
            String query = "select first_name, last_name FROM FAKE_CAR_DATA;;";

            //Load mysql jdbc driver
            Class.forName("com.mysql.cj.jdbc.exceptions");

            //Create Connection to DB
            Connection con = DriverManager.getConnection(dbUrl, username, password);

            //Create Statement Object
            Statement stmt = con.createStatement();

            // Execute the SQL Query. Store results in ResultSet
            ResultSet rs = stmt.executeQuery(query);

            // While Loop to iterate through all data and print results
            while (rs.next()) {
                String first_name = rs.getString(1);
                String last_name = rs.getString(2)

                System.out.println(" " +first_name+" "+last_name);
            }
            // closing DB Connection
            con.close();
        }

        }

