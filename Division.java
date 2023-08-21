package arithmetic;
 interface Arithmetic {
    double calculate(double num1, double num2);
    }
public class Division implements Arithmetic {
    public double calculate(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
    }
}
