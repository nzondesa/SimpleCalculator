import java.util.Scanner;

public class SimpleCalculator implements Calculator{

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //Declaring variables
        double a;
        double b;
        String function;

        //Taking in user input
        System.out.print("Enter the first number: ");
        a = keyboard.nextDouble();
        System.out.print("Select operator (/*-+): ");
        function = keyboard.next();
        System.out.print("Enter the second number: ");
        b = keyboard.nextDouble();

        //Conditions
        if (function == "+")
        {
            double result = Calculator.add(a, b);
            System.out.print("Your answer is " + result);
        }
        if (function == "-")
        {
            double result = Calculator.add(a, b);
            System.out.print("Your answer is " + result);
        }
        if (function == "/")
        {
            double result = Calculator.divide(a, b);
            System.out.print("Your answer is " + result);
        }
        if (function == "*")
        {
            double result = Calculator.multiply(a, b);
            System.out.print("Your answer is " + result);
        }

    }
}
