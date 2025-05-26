public class Student {
    String name;
    int marks;

    public Student() {
        this.name = "Unknown";
        this.marks = 0;
    }
    
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public void setStudentDetails(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void getStudentDetails() {
        System.out.println(name + ", " + marks);
    }
}
    
public class ClassInitialization {
    public static void main(String[] args) {

        System.out.println("1. Intitialization using reference variable:");
        Student s1 = new Student();
        s1.name = "Swati Sharma";
        s1.marks = 85;
        s1.getStudentDetails();

        
        System.out.println("2. Intialization using Constructor:");
        Student s2 = new Student("Bob Smith", 92);
        s2.getStudentDetails();
        
        System.out.println("3. Initialization using Method:");
        Student s3 = new Student();
        s3.setStudentDetails("Charlie Simpson", 78);
        s3.getStudentDetails();
        
    }
}