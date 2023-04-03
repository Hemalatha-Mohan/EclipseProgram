package ExerciseJava;

import java.util.Scanner;

public class AreaOfPentagon {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides: ");
        int n = input.nextInt();
        System.out.print("Input the side: ");
        double side = input.nextDouble();
        
        double Area;
       
       Area=(Math.sqrt(n * (n + 2 * (Math.sqrt(n)))) * side * side) / 4;
        System.out.println("The area of the pentagon is " + Area);
    }

   

	

}
