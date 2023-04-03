package ExceptionHandling;
/*
You can create your own exception and give implementation as to how it should behave.
Your exception will behave like a child’s class of Exception.
Example:
let’s say, you are working with an airline company
You are in the luggage check-in department and as per rules, you can allow 15kg per customer.
So now more than 15kg of weight is an abnormal condition for us or in other words its an exception
This is our logic-based exception, so we’ll create our custom exception WeightLimitExceeded
As per syntax, it will extend Exception.
We define the constructor which will get invoked as soon as an exception will be thrown
We have to explicitly throw the exception and hence we will use throw keyword for that.
Using throws keyword is as per our need. If we are handling an exception
where it is getting thrown then we can avoid throws,
else we will use throws and handle it in the caller.
 */

import java.util.Scanner;

class WeightLimitExceeded extends Exception{
    WeightLimitExceeded(int x){
        System.out.print(Math.abs(15-x)+" kg : ");
    }
}

 class CustomException {
    void validWeight(int weight) throws WeightLimitExceeded{
        if(weight>15)
            throw new WeightLimitExceeded(weight);
        else
            System.out.println("You are ready to fly!");

}
    public static void main (String[] args) {
        CustomException ob=new CustomException();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<2;i++){
            try{
                ob.validWeight(in.nextInt());
            }catch(WeightLimitExceeded e){
                System.out.println(e);
            }
        }

    }
}
