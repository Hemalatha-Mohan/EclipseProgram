package ExerciseJava;

import java.util.Scanner;

public class PentagolNumbers {

	public static void main(String[] args) {

		int n,x,n1;
		Scanner input = new Scanner(System.in);
		System.out.print("How Many Elements you want in the sequence ");
		n = input.nextInt();
		n1=1;
		while (n1<=n) 
		{
		        x = (3*n1*n1 - n1)/2;
		        System.out.print(x+" ");
		        n1++;
		}

	}

}
