package calculator;

public class Financial extends Calculator{
    public Financial(){}
    @Override
    public void sum (double a, double b){
        System.out.println("Sum: " + a + " + " + b + " = " + (a + b));
    }
    @Override
    public void subtraction (double a, double b){
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
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
        System.out.println("Financial: " + a + " * " + b + " = " + (a * b));
    }
    public void depositInterest (double firstSum, double annualRate, int dayOfDeposit){
        double interestPaid = (firstSum * annualRate * dayOfDeposit / 365) / 100;
        System.out.println("Your interest income on the deposit will be: " + interestPaid);
    }
    public void marginCalculation (double sellingPrice, double costPrice){
        double margin = (sellingPrice - costPrice) / sellingPrice * 100;
        System.out.println("Your margin will be: " + margin + " %");
    }

}
