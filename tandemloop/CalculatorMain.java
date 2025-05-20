/*Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class. */

import java.util.Scanner;

class Calculator {
    double a, b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate(String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operation type. Use add, subtract, multiply, or divide.");
        }
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        Calculator calc = new Calculator(a, b);

        try {
            double result = calc.calculate(operation);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
