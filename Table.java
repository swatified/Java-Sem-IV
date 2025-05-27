import java.util.Scanner;

public class Table {

    // Iterative method
    static void printTableIterative(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Recursive method
    static void printTableRecursive(int num, int i) {
        if (i > 10) return;
        System.out.println(num + " x " + i + " = " + (num * i));
        printTableRecursive(num, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();

        // Call both methods
        System.out.println("\nTable of " + num + " using loop:");
        printTableIterative(num);
        System.out.println("\nTable of " + num + " using recursion:");
        printTableRecursive(num, 1);
    }
}
