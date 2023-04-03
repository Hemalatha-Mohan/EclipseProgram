package ExerciseJava;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str1 = in.nextLine();
       
        // String str = str1.toLowerCase();(//Accepts both upper and lower case)
        //System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
       
        
        System.out.print("Number of  Vowels in the string: " + count_Vowels(str1)+"\n");
        
    }
 public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')


            {
                count++;
             // System.out.println("The vowels in given string are:"+str.charAt(i));
            }
        }
        return count;
		
		
		//Accepts both upper case and lower case 
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1 = sc.nextLine();
		
		
		int i;
		int l=s1.length();
		char ch;
		int count=0;
		
		
		String s = s1.toLowerCase();
		for( i=0; i<l; i++)
		{
	
		ch = s.charAt(i);
		if (ch == 'a' ||ch =='e'||ch =='i'||ch =='o'||ch =='u')
			count++;
		}
		System.out.println("vowels in a string:"+count);*/
}
	}
