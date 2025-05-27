import java.util.Scanner;

class LargestNumber{
    public static void main(String [] args){
        
    System.out.println("Please enter 3 numbers:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a>b){
        if(a>c){
            System.out.println("Largest number: "+a);
        }
    }
    else if(b>c){
        System.out.println("Largest number: "+b);
    }
    else{
        System.out.println("Largest number: "+c);
    }
  }
}