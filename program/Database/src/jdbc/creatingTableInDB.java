package jdbc;

import java.sql.*;



public class creatingTableInDB {
	
	
	public static void main(String[] args)  {
		Connection conn = null;
		Statement stmt = null;
		
		
		//The objective of a try, catch block is to try and do something which could fail and raise an exception.
		//A try block is the block of code in which exceptions occur.
		//A catch block catches and handles try block exceptions.
			try{
			
			//registering JDBC driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//open a connection to our database
			
			System.out.println("connecting to the database");
			conn = DriverManager.getConnection("jdbc:mysql://10.30.1.64:3306/hemalamo","hemalamo","123");
			
			System.out.println("connected successfully");
			
			
			//Execute the query
			
			System.out.println("Creating the required table");
			stmt = conn.createStatement();
			
			String sql = "CREATE TABLE STUDENTMARKLIST"+
			"(ROLLNO INT NOT NULL AUTO_INCREAMENT"+
					"NAME VARCHAR(30)"+
					"ENGLISH INT"+
					"TAMIL INT"+
					"MATHS INT"+
					"SCIENCE INT"+
					"SOCIAL INT"+
					"PRIMARY KEY(ROLLNO))";
			stmt.executeLargeUpdate(sql);
			System.out.println("created the required table in the database");
			
		}
			catch(SQLException se) {
				//Handle the errors for JDBC
				
				se.printStackTrace();
		}
	      catch(Exception e) {
	    	  
	    	  //Handles the error for Class ForName
	    	  
	    	  e.printStackTrace();
	      }
			
	    	finally {
	    		 //finally block is usually used to close the resources
	    		 
	    		 try {
					if(stmt != null) {
						 conn.close();
					 }
				} catch (SQLException se) {
					
					se.printStackTrace();
				}
	    		 
	    		 try {
					if(conn!=null) {
						 conn.close();
					 }
				} catch (SQLException se) {


					se.printStackTrace();
				}
	    		 
	    		 }
	    	  
	    	 System.out.println("done successfully"); 
	    	  
	      }

}


/*Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://10.30.1.64:3306/hemalamo", "hemalamo", "123");
//Statement st = con.createStatement();
//ResultSet rs = st.executeQuery("Select * from employee_java");
System.out.println("connection was successful" );
//st.close();
con.close();
	}*/


