package checkCalculator;

import calculator.*;
public class CheckCalculator {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        Program program = new Program();
        Financial financial = new Financial();
        Accounting account = new Accounting();
        Calculator calculator = new Engineer();

        System.out.println("-----------------------------");
        engineer.cubeRootOfNumber(9);
        program.hexToBit(349);
        financial.depositInterest(3000,3.5, 302);
        account.profitabilityCalculation(20,500);
        System.out.println("--------------------------------");

        engineer.sum(4.6, 9.8);
        financial.sum(4.6, 9.8);
        calculator.multiplication(4,8);
        financial.multiplication(5,8);
        program.subtraction(3.6, 8.97);
        account.subtraction(2.5, 4.65);
    }
}
