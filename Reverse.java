import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.next();
        
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        
        if(s.matches("[0-9]+")){
        System.out.println("Reversed number: " + reversed);
        }
        else {
            System.out.println("Please enter a valid number.");
        }
    }
}