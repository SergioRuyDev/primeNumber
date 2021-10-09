import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to find out if it is prime: ");
        int numberTyped = scanner.nextInt();

        if (prime(numberTyped)) {
            System.out.println(numberTyped + " is a prime number.");
        } else {
            System.out.println(numberTyped + " is not a prime number.");
        }

        scanner.close();
    }

    private static boolean prime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
