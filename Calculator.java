import java.util.Scanner;

class Calculator{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter another number:");
        int b = sc.nextInt();
        System.out.println("Choose an operation: +, -, *, /");
        String choice = sc.next();

        switch(choice) {
            case "+":
                System.out.println("Sum is: " + (a+b));
                break;
            case "-":
                System.out.println("Result is: " + (a-b));
                break;
            case "*":
                System.out.println("Product is: " + (a*b));
                break;
            case "/":
                try {
                    System.out.println("Result is: " + (a/b));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}