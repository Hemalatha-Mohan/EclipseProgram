package OOPS;

import java.util.Scanner;

public class Circle {
	public static double radius;
	    
	    public static double area()
	    {
	        return Math.PI*radius*radius;
	    }
	    public static double perimeter()
	    {
	        return 2*Math.PI*radius;
	    }
	    public static double circumference()
	    {
	        return perimeter();
	    }
	            

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		
		Circle c1=new Circle();
	    // c1.radius=7;
		
		radius = s.nextDouble();
		
		
		 System.out.println("Area:"+area());
	     System.out.println("Perimeter:"+ perimeter());
	     System.out.println("Circumference:"+circumference());

	}

}
