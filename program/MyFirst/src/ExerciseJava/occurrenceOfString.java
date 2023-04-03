package ExerciseJava;

import java.util.Scanner;

public class occurrenceOfString {

	public static void main(String[] args) {

		//String s = "Hemalatha";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String s = sc.nextLine();
		int count = 0;
		char a[];
		a=s.toCharArray();
		int len = a.length;
		for (int i=0;i<len;i++) {
			for (int j=0;j<len;j++) {
				if (a[i]== a[j]) {
					count++;
					
				}
			}
			System.out.println(a[i]+"  =  "+count);
			count=0;
		}
	}

}
