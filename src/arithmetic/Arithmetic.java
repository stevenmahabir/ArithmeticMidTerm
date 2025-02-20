/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;
import static java.time.Clock.system;

/**
 * This class calls the method to perform arithmetic operations based on user
 * input execute the code check the output
 *
 * @author sivagamasrinivasan
 *
 */
public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticBase calculator = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        System.out.println("Available operations:");
        for (ArithmeticBase.Operation op : ArithmeticBase.Operation.values()) {
            System.out.println("- " + op);
        }

        System.out.println("Enter first number:");
        double n = in.nextDouble();
        System.out.println("Enter second number:");
        double m = in.nextDouble();

        ArithmeticBase.Operation selectedOperation = null;
        while (selectedOperation == null) {
            System.out.println("Enter operation (e.g., PLUS, MINUS, TIMES, DIVIDE):");
            String opName = in.next().toUpperCase();

            try {
                selectedOperation = ArithmeticBase.Operation.valueOf(opName); // Convert to enum
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid operation. Please choose from the list.");
            }
        }

        double result = selectedOperation.calculate(n, m);
        System.out.println("Result: " + result);

        in.close();
    }
}
