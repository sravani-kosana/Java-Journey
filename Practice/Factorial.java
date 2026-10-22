import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer (0-20): ");
        int number = sc.nextInt();

        if (number < 0 || number > 20) {
            System.out.println("Enter a number between 0 and 20.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial: " + factorial);
        }

        sc.close();
    }
}
