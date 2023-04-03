package ExerciseJava;

import java.util.Scanner;

public class Average2 {
	
	
	

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = n.nextDouble();
        System.out.print("Input the second number: ");
        double y = n.nextDouble();
        System.out.print("Input the third number: ");
        double z = n.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );

	}
        public static double average(double x, double y, double z)
        {
            return (x + y + z) / 3;
        }

	}


/*2. Write a Java method to compute the average of three numbers.  

Test Data: 
Input the first number: 25 
Input the second number: 45 
Input the third number: 65 
Expected Output: 

The average value is 45.0 

*/