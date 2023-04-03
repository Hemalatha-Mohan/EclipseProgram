package ExceptionHandling;

//When there is another try block within the try block

public class NestedTry {
    public static void main (String[] args) {
        try{
            try{
                int[] a={1,2,3};
                System.out.println(a[3]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Out of bounds");
            }
            System.out.println(4/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : divide by 0");
        }
    }
}
/*Note – If we put code of outer try before inner try, then if an exception occurred,
it will ignore the entire inner try and move directly to its catch block.
public static void main (String[] args) {
        try{
               System.out.println(4/0);
               try{
                    int[] a={1,2,3};
                    System.out.println(a[3]);
                }
   catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Out of bounds");
                }
        }
       catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : divide by 0");
        }
	}



 */