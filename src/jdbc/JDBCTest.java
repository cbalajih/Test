package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
		
		}
		
		
		Connection conn;
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "testavco","oracle");
			
			Statement st = conn.createStatement();
			
			//String query = "SELECT * FROM STUDENT";
			String query = "SELECT * FROM STUDENT WHERE NAME LIKE '%e'";
			
			ResultSet rs = st.executeQuery(query);
			System.out.println("ID   NAME           Marks");
			while(rs.next()){
				
				System.out.print(rs.getInt(1));
				System.out.print("   ");
				System.out.print(rs.getString(2));
				System.out.print("   ");
				System.out.println(rs.getInt(3));
				
			}
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		System.out.println("Connection created...");
		
	}

}
