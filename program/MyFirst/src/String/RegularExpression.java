package String;

public class RegularExpression {

	public static void main(String[] args) {

		 //Cheking if a string is Binary number
		
		int b=100110010;
        
        String str=String.valueOf(b);
        
        System.out.println(str.matches("[01]+"));
        
        
        // hexadecimal
        
        String str1 ="B234A";
        
        //String str1=String.valueOf(b);
        
        System.out.println(str1.matches("[0-9A-F]+"));
        
        //To Find the date
        
        String d="01/02/2000";
        
        System.out.println(d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
        
        
        // to remove spcl character from the string
        
        String str3="a!B@c#1$2%3";
        
        str=str3.replaceAll("[^a-zA-Z0-9]", "");
                
        System.out.println("removed spcl character:"+str);
        
        // to remove spaces
        
        String str4="abc   def   ghi  jkl";
        str=str4.replaceAll("\\s+","");
       System.out.println("removed spaces b/w character:"+str);
        
       //to remove the starting and ending spaces
       
       String str5="    abc   def   ghi  jkl";
       str=str5.replaceAll("\\s+","").trim();
      System.out.println("removed spaces b/w character:"+str);
       
       //to count the no.of words
      
      String str6="Hello world";
      
      //str=str6.replaceAll("\\s+", " ").trim();
      
      String words[]=str6.split("\\s");
      
      System.out.println(words.length);
      
	}

}
