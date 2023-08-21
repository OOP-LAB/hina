import arithmetic.*;
public class calculate {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        Addition addition = new Addition();
        double sum = addition.calculate(num1, num2);
        System.out.println("Addition: " + sum);

        Subtraction subtraction = new Subtraction();
        double difference = subtraction.calculate(num1, num2);
        System.out.println("Subtraction: " + difference);

        Multiplication multiplication = new Multiplication();
        double product = multiplication.calculate(num1, num2);
        System.out.println("Multiplication: " + product);

        Division division = new Division();
        try {
            double quotient = division.calculate(num1, num2);
            System.out.println("Division: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}


