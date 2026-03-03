import java.util.Scanner;

public class division {
    static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a divisable: ");
        int divisable= sc.nextInt();
        if (divisable %3==0 && divisable %7==0) {
            System.out.println("Divisable by 3 and 7:");
        } else {
            System.out.println("get lost");

        }

    }
}
