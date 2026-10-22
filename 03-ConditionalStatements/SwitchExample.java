import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 3: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Java");
                break;

            case 2:
                System.out.println("Python");
                break;

            case 3:
                System.out.println("Machine Learning");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
