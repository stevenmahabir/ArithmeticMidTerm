/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/**
 * This class takes String input plus,minus,divide and times from user and
 * execute the arithmetic operation change the code to use enum instead String
 * and mention the advantage of enum.
 *
 * @author sivagamasrinivasan
 *
 */
class ArithmeticBase {
    enum Operation {
        PLUS {
            public double calculate(double x, double y) {
                return x + y;
            }

            public String toString() {
                return "Addition (+)";
            }
        },
        MINUS {
            public double calculate(double x, double y) {
                return x - y;
            }

            public String toString() {
                return "Subtraction (-)";
            }
        },
        TIMES {
            public double calculate(double x, double y) {
                return x * y;
            }

            public String toString() {
                return "Multiplication (*)";
            }
        },
        DIVIDE {
            public double calculate(double x, double y) {
                if (y == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return x / y;
            }

            public String toString() {
                return "Division (/)";
            }
        };

        public abstract double calculate(double x, double y);
    }
}