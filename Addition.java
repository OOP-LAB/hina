package arithmetic;
interface Arithmetic {
    double calculate(double num1, double num2);
    }
public class Addition implements Arithmetic {
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}
