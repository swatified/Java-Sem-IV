class Student {
    private String name;
    private int age;
    private String course;
    private int fees;
    
    // Constructor 1: Only name
    public Student(String name) {
        this(name, 18); // Calls constructor 2
    }
    
    // Constructor 2: Name and age
    public Student(String name, int age) {
        this(name, age, "Core"); // Calls constructor 3
    }
    
    // Constructor 3: Name, age, and course
    public Student(String name, int age, String course) {
        this(name, age, course, 5000); // Calls constructor 4
    }
    
    // Constructor 4: All parameters (main constructor)
    public Student(String name, int age, String course, int fees) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.fees = fees;
    }

    public void displayInfo() {
        System.out.println(name+" "+age+" "+course+" "+fees+"\n");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        
        Student s1 = new Student("Diana");
        s1.displayInfo();

        Student s2 = new Student("Diana", 24);
        s2.displayInfo();

        Student s3 = new Student("Diana", 24, "Mathematics");
        s3.displayInfo();

        Student s4 = new Student("Diana", 24, "Mathematics", 7500);
        s4.displayInfo();

    }
}
