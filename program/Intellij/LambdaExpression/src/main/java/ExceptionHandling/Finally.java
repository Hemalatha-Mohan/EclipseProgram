package ExceptionHandling;
/*Contains code that must be executed no matter if an exception is thrown or not.
It contains code of file release, closing connections, etc.
 */

public class Finally {
    public static void main (String[] args) throws Exception {
        try{
            System.out.println(4/0);
        } finally
        {
            System.out.println("finally executed");
        }

        System.out.println("end");
    }
}
