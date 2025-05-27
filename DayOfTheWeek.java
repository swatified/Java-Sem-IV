import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.print("Enter a number to get the day of the week: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 0 && num <= 7) {
            System.out.println("Day " + num + " is: " + days[num-1]);
        } else {
            System.out.println("Oops! Please enter a number between 1 and 7. 🙈");
        }
    }
}
