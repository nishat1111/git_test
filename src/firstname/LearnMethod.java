package firstname;
public class LearnMethod {
    public static void doMultiply(int a, int b) {
        int multiply= a * b;
        System.out.println(multiply);
    }
    public static void doDivision(int c, int d) {
        int division= c / d;
        System.out.println(division);
    }
    public static void doSum(double e, double f){
        double sum= e + f;
        System.out.println(sum);
}
    public static void doSubtract(int g, int h) {
        int subtract = g - h;
        System.out.println(subtract);
    }
    //// Write a method that can take 3 integer and can multiply first two numbers.
    // 3rd number will added to the multiplication value.
   public static void doMultiply1(int num1, int num2, int num3) {
            int multiply1= (num1 * num2) + num3;
    System.out.println(multiply1);
    }
    // Return Type Method---1. Non-parameterised
    // AccessModifier + Static/not + DataType + MethodName + () + {
    // Return result
    // }
    public static double testReturnMethod() {

        double a= 3.44;
        double b=2.0;

        double result= a +b;

        //System.out.println("This a return type non-parameterised method");

        return result;
    }


    public static double doSum1( double i, double j ) {
        double result = i + j;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        doMultiply(10,65);
        doDivision( 40,  20);
        doSum( 2.4,  3.5);
        doSubtract(30,  20);
        doMultiply1( 5, 6, 7);
        doSum1( 2.5, 4.5);
    }

}