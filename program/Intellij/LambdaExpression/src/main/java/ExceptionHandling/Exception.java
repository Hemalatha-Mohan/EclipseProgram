package ExceptionHandling;

/*While catching the exception in the catch block, either you can have directly the class of exception
 or its superclass.

Example: Exact Exception


 */
public class Exception extends Throwable {
    public static void main (String[] args) {
        try{
            System.out.println(4/0);
        }

        //ArithmeticException
        catch(ArithmeticException e){
            System.out.println("divide by 0");
        }
    }

    /*multiple catch block
    try{
            System.out.println(4/0);
        }catch(Exception e)
        {
            System.out.println("Exception : divide by 0");
        }catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException :divide by 0");
        }
	}
     output : compile time error
     Correct code:
     try{
            System.out.println(4/0);
        }catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : divide by 0");
        }catch(Exception e)
        {
            System.out.println("Exception : divide by 0");
        }
   }
   output:
   ArithmeticException: Divide by 0

     */
}
