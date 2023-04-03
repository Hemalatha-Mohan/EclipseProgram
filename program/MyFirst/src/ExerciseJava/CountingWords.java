package ExerciseJava;

import java.util.Scanner;

public class CountingWords {

	public static void main(String[] args) {
		
		/*String str = "The quick brown fox jumps over the lazy dog";
		int count = 1;
 
        for (int i = 0; i < str.length(); i++)
        {
            if ((str.charAt(i) == ' ')&& (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);*/
		
		
		//string entered by the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String s = sc.nextLine();
		int count = 1;
		
		for (int i=0; i <= s.length()-1; i++)
		{
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!= ' ')) 
			{
				count++;
			}
		}
			System.out.println("Number of words"+count);
		
		//to count particular character in a string
		
		/*String s = "hello";
		
		int totalcount = s.length();
		int totalcount_afterRemove = s.replace("l","").length();
		int count = totalcount -  totalcount_afterRemove;
		
		System.out.println("number of occurrence of l is:" +count);*/
		
		
    }
    


	

}


/* Initialize count with 1 as if there are no spaces in the string, then there will be one word in the String.
Check if you encounter any space.
Once you find the space, check it next character. If it is not space then we found a word in the String.Increment the count variable.
Once you reach end of String, count variable will hold number of words in the String.*/
