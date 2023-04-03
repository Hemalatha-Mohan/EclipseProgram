package conditionalStatements;

import java.util.Scanner;

public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		//for both string or number
		
		/* String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");*/
		
		
		Scanner scan=new Scanner(System.in);

	       System.out.println("Enter a Number");
	       int n=scan.nextInt();
	       int m=n;
	        int rev=0,r;
	        
	        while(n>0)
	        {
	        	r=n%10;
	        	rev=rev*10+r;
	        	n=n/10;
	        }
	        
	        if(rev==m) 
	        	System.out.println("entered no: is a palindrome");
	        else
	        	System.out.println("entered no: is not a palindrome");
	        }
	        

	}


