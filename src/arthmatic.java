import java.util.Scanner;

public class arthmatic {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double num1, num2;
            double sum, difference, product,quotient;

            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            sum = num1 + num2;
            difference = num1 - num2;
            product = num1 * num2;
            quotient = num1%num2;

            // Write division line here

            System.out.println("Addition = " + sum);
            System.out.println("Subtraction = " + difference);
            System.out.println("Multiplication = " + product);
            System.out.println("Division = " + quotient);

            sc.close();
        }
    }



