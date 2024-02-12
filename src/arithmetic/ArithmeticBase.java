package arithmetic;

import java.util.Scanner;

public class ArithmeticBase {
    public double x, y;

    enum Operation {
        PLUS,
        MINUS,
        TIMES,
        DIVIDE
    }

    double calculate(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operation " + operation);
        }
    }

    public static void main(String[] args) {
        ArithmeticBase arithmetic = new ArithmeticBase();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String input = sc.next().toUpperCase();
        Operation operation = Operation.valueOf(input);

        double result = arithmetic.calculate(x, y, operation);
        System.out.println("Result: " + result);
    }
}
