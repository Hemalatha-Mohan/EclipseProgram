package ExerciseJava;

import java.util.Scanner;


//any year divisible by 400 its a leap year
//if divisible by 4 and not divisible by 100 then it is a leap year
//else not a leap year

public class leapYear {

	public static void main(String[] args) {

		 Scanner scan=new Scanner(System.in);
	        
	        System.out.println("Enter a Year number");
	        int year=scan.nextInt();
	        
	       /* if(year%4==0)
	        {
	            if(year%100==0)
	            {
	                if(year%400==0)
	                {
	                     System.out.println("Its a Leap Year");
	                    
	                }
	                else
	                    System.out.println("Not a Leap Year");
	                    
	                
	            }
	            else
	            {
	                  System.out.println("Its a Leap Year");

	            }
	            
	        }
	        else
	        {
	            System.out.println("Not a Leap Year");
	            
	        }*/
	        
	        if(year==400) 
	        {
	        	System.out.println("its a leap year");
	        }
	        else if(year%4==0 && year%100==0)
	        {
	        	System.out.println("Its a leap year");
	        }
	        else
	        {
	        	System.out.println("Not a leap year");
	        }


	}

}
