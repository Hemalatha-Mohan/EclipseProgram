package ExceptionHandling;

/*It is a keyword that is used to explicitly throw an exception.

We can use throw where according to our logic an exception should occur.

 */

public class throwKeyword {

    static void canVote(int age){
        if(age<18)
            try{
                throw new Exception();
            }catch(Exception e){
                System.out.println("you are not an adult!");
            }
        else
            System.out.println("you can vote!");
    }
    public static void main (String[] args) {
        canVote(20);
        canVote(10);
    }

    /*Throws Keyword
    Throws keyword is used when callee doesn’t want to handle the exception rather
    it wants to extend this responsibility of handling the exception to the caller of the function.
Basically says what sort of exception the code can throw and relies on the caller to handle it.
It is used to handle checked Exceptions as the compiler will not allow code to compile until they are handled.


static void func(int a) throws Exception{
		   System.out.println(10/a);
	}
	public static void main (String[] args) {
		try{
		    func(10);
		    func(0);
		}catch(Exception e){
		   System.out.println("can't divide by zero");
		}

	}

     */
}
