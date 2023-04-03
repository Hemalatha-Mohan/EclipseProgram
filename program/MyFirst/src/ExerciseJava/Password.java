package ExerciseJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	
 public static boolean is_Valid_Password(String password)
		    {
		  
		        //using Regular expression
		        String regex = "^(?=.*[0-9])"
		                       + "(?=.*[a-z])(?=.*[A-Z])"
		                       //+ "(?=.*[@#$%^&+=])"
		                       + "(?=\\S+$).{8,20}$";
		  
		        // compiling the Regular expression
		        Pattern p = Pattern.compile(regex);
		  
		        // If the password is empty return false
		        if (password == null) {
		            return false;
		        }
		       
		        //matcher is used to find wheather the given password string matches the patter or not
		        
		        Matcher m = p.matcher(password);
		  
		        // Return if the password
		        // matched the ReGex
		        return m.matches();
		    }
		  
		   
		    public static void main(String args[])
		    {
		    	 Scanner input = new Scanner(System.in);
		         System.out.print(
		                 "1. A password must have at least eight characters.\n" +
		                 "2. A password consists of only letters and digits.\n" +
		                 "3. A password must contain at least two digits \n" +
		                 "Input a password (You are agreeing to the above Terms and Conditions.): ");
		         String s = input.nextLine();

		         if (is_Valid_Password(s)) {
		             System.out.println("Password is valid: " + s);
		         } else {
		             System.out.println("Not a valid password: " + s);
		         }

			
		    }}


