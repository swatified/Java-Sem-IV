class Student {

    // STATIC VARIABLES - Belong to class, shared by all objects
    static String schoolName = "ABC High School";
    static int totalStudents = 12;
    static String principal;
    
    // Instance variables
    String name;
    int rollNo;

    Student(String n, int r){
        this.name = n;
        this.rollNo = r;
    }

    
    // STATIC BLOCK - Executed when class is first loaded
    static {
        principal = "Dr. Sharma";
        totalStudents++;
        System.out.println("STATIC BLOCK EXECUTED\n");
    }
}

class School{
    public static void schoolInfo() {
        System.out.println("\nSchool info card is being printed!");
    }
}
    
public class Static {
    public static void main(String[] args) {
        Student s = new Student("Swati", 119);
        System.out.println(s.name+"("+s.rollNo+") studies in "+s.schoolName+" whose Principal is "+s.principal);
        // Notice how we assigned only name and rollno yet school and principal was being shared throughout the class
        School.schoolInfo();
    }
}