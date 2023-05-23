package calculator;

public class Accounting extends Calculator{
    public Accounting(){}
    @Override
    public void sum (double a, double b){
        System.out.println("Sum: " + a + " + " + b + " = " + (a + b));
    }
    @Override
    public void subtraction (double a, double b){
        System.out.println("Subtraction for accounting: " + a + " - " + b + " = " + (a - b));
    }
    @Override
    public void division (double a, double b){
        if(b == 0){
            throw new ArithmeticException("We can't divide by zero");
        } else {
            System.out.println("Division: " + a + " / " + b + " = " + (a / b));
        }
    }
    @Override
    public void multiplication (double a, double b){
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
    }
    public void netSalary (double salary){
        double netSalary = salary - 0.18  * salary - 0.15 * salary;
        System.out.println("Your salary after tax will be: " + netSalary);
    }
    public void profitabilityCalculation (double profit, double revenue){
        double profitability = profit / revenue * 100;
        System.out.println("Your profitability will be: " + profitability + " %");
    }
}
