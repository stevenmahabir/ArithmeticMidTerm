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
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        double n = in.nextDouble();
        System.out.println("Enter second number:");
        double m = in.nextDouble();

        System.out.println("Results for all operations:");
        for (ArithmeticBase.Operation op : ArithmeticBase.Operation.values()) {
            try {
                double result = op.calculate(n, m);
                System.out.println(op + " result: " + result);
            } catch (ArithmeticException e) {
                System.out.println(op + " error: " + e.getMessage());
            }
        }

        in.close();
    }
}
