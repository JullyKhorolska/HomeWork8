package calculator;
public class Engineer extends Calculator{
    public Engineer(){}
    @Override
    public void sum (double a, double b){
        System.out.println("a + b = " + (a + b));
    }
    @Override
    public void subtraction (double a, double b){
        System.out.println("a - b = " + (a - b));
    }
    @Override
    public void division (double a, double b){
        if(b == 0){
            throw new ArithmeticException("We can't divide by zero");
        } else {
            System.out.println("a / b = " + (a / b));
        }
    }
    @Override
    public void multiplication (double a, double b){
        System.out.println("Engineer: " + "a * b = " + (a * b));
    }
    public void cubeRootOfNumber (double number){
        System.out.println("Cube root of " + number + " = " + Math.cbrt(number));
    }
    public void logarithmBaseTenOfNumber (double number){
        System.out.println("Base 10 logarithm of " + number + " = " + Math.log10(number));
    }
}
