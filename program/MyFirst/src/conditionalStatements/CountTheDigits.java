package conditionalStatements;

import java.util.Scanner;

public class CountTheDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	       System.out.println("Enter a Number");
	       int n=scan.nextInt();
	       int count=0;
	       while(n>0)
	       {
	        n=n/10;
	        count++;
	       }
	        System.out.println(count);
	    

	}

}
