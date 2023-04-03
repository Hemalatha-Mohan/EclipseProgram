package ExerciseJava;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        int a,b,c;
        double s,area;
        
        //System.out.println("Enter 3 Sides of a Triangle");
        System.out.println("Enter side1:");
        a=sc.nextInt();
        
        System.out.println("Enter side2:");
        b=sc.nextInt();
        
        System.out.println("Enter side3:");
        c=sc.nextInt();
        
        
        s=(a+b+c)/2f;
        
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("Area of Triangle is "+area);
        

	}

}
