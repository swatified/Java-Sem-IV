import java.util.Scanner;

public class Factorial {

    // Iterative factorial
    static int factorialIterative(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Recursive factorial
    static int factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers!");
        } else {
            int f1 = factorialIterative(num);
            int f2 = factorialRecursive(num);

            System.out.println("\nLoop Answer: " + f1);
            System.out.println("Recursive Answer: " + f2);
        }
    }
}