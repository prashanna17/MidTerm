package arithmetic;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        double m = in.nextDouble();
        double n = in.nextDouble();

        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String input = in.next().toUpperCase();
        ArithmeticBase.Operation operation = ArithmeticBase.Operation.valueOf(input);

        double result = r.calculate(m, n, operation);
        System.out.println("Result: " + result);
    }
}
