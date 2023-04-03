package ExerciseJava;

import java.util.Scanner;

public class smallestNumber {

	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			System.out.print("Input the first number: ");
	        double x = s.nextDouble();
	        System.out.print("Input the Second number: ");
	        double y = s.nextDouble();
	        System.out.print("Input the third number: ");
	        double z = s.nextDouble();
	        System.out.print("The smallest value is " +(double)Math.min(Math.min(x, y),z)+"\n" );
	    }
           /*
	   public static double smallest(double x, double y, double z)
	    {
	        return Math.min(Math.min(x, y), z);
	    }*/

	

}


/*1. Write a Java method to find the smallest number among three numbers.   
Test Data: 
Input the first number: 25 
Input the Second number: 37 
Input the third number: 29 
 

Expected Output: 

The smallest value is 25.0 */