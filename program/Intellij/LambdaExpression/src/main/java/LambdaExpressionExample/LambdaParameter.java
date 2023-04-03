package LambdaExpressionExample;
interface Addable{
    int addition(int a,int b);
}

class Addition implements Addable {

    @Override
    public int addition(int a, int b) {
        return (a + b);
    }
}
public class LambdaParameter {
    public static void main(String[] args){

      //  Addable addition = ( a,b) ->(a+b);

       //     int result = addition.addition(20,10);
         //   System.out.println(result);

Addable ab = (int a, int b)->{
    int c = (a+b);
    return c;
};

    }
}
