package String;

public class StringPattern1 {

	public static void main(String[] args) {
         
		//Any character (may or may not match terminator)
	
		/*String str1="f";
        System.out.println(str1.matches("."));*/
        
		
        /*String str1="a";//b,c
        System.out.println(str1.matches("[abc]"));*/
        
        /*String str1="p";//true for alphabets other than abc
        System.out.println(str1.matches("[^abc]"));*/
		
		
        /*String str1="7";//A,a7
        System.out.println(str1.matches("[a-zA-Z0-9]"));//[a-z][0-9]*/
        
        /*String str1="b";
        System.out.println(str1.matches("a|b"));*/
		
		//Any word character, short for [a-zA-Z_0-9]
        
        /*String str1="b";
        System.out.println(str1.matches("\\w"));*/
		
		
        //A word boundary
        /*String str1="5";
        System.out.println(str1.matches("\\d"));*/
		
        //Any non-digit, short for [^0-9]
        String str1="$";
        System.out.println(str1.matches("\\D"));

	}

}
