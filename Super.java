class Person {
    String name;
    int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called: " + name);
    }
    
    // Method in parent class
    public void display() {
        System.out.println("Person - Name: " + name + ", Age: " + age);
    }
    
    public void work() {
        System.out.println(name + " is working");
    }
}


class Student extends Person {
    String school;
    int rollNo;
    
    // Use 1: Calling parent class constructor
    public Student(String name, int age, String school, int rollNo) {
        super(name, age); 
        this.school = school;
        this.rollNo = rollNo;
    }

    
    // Use 2: To access parent class variables
    public void showDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("School: " + school);
        System.out.println("Roll No: " + rollNo);
    }
    
    // Use 3: To call parent class method
    public void display() {
        super.display();
        System.out.println("Student - School: " + school + ", Roll No: " + rollNo);
    }
    
    // USE 4: To extend parent method functionality
    public void work() {
        super.work();  // First call parent method
        System.out.println(name + " is also studying at " + school);
    }
} 

public class Super {
    public static void main(String[] args) {

        Student student1 = new Student("Swati", 18, "DGI", 101);
        student1.showDetails();
        student1.display();
        student1.work();

    }
}