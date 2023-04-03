package ExceptionHandling;

public class TryCatch {
    public static void main (String[] args) {
        int a=10;
        for(int i=3;i>=0;i--)
            try{
                System.out.println(a/i);
            }catch(ArithmeticException e){
                System.out.println(e);
            }
    }

    /*Do not keep any code after the statement which is prone to exception. Because if an exception occurred,
    it will straight away jump to the catch or finally block, ignoring all other statements in the try block.
    public static void main (String[] args) {
         try
       {
             System.out.println(4/0);
	 //will not get printed
             System.out.println("end of try!");
        }
catch(ArithmeticException e)
        {
            System.out.println("divide by 0");
        }
    }
     */
}
