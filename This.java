class Student {
    // Instance variables
    private String name;
    private int id;
    
    // Use 1: Resolving name conflicts between instance variables and parameters
    public Student(String name, int id) {
        this.name = name;  // this.name refers to instance variable
        this.id = id;      // name and id refer to parameters
    }

    
    // Use 2: Calling one constructor from another constructor
    public Student(String name) {
        this(name, 0);  // Calls the above constructor with default id = 0
    }
    

    // Use 3: Passing current object as method argument
    public void displayInfo() {
        
        // Passing current object to another method
        printDetails(this); 
    }

    public void printDetails(Student student) {
        System.out.println(student.getName() + " (ID: " + student.getId() + ")");
    }


    // Use 4: Returning current object from method (for method chaining)
    public Student setName(String name) {
        this.name = name;
        return this;  // Returns current object
    }
    
    public Student setId(int id) {
        this.id = id;
        return this;  // Returns current object
    }
    

    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
}


public class This {
    public static void main(String[] args) {

        // Creating a Student object using the constructor
        Student student1 = new Student("Swati", 101);
        
        // Displaying student info
        student1.displayInfo();
        
        // Demonstrating method chaining using 'this'
        student1.setName("Swati Sharma").setId(202);
        
        // Displaying updated student info
        System.out.println("Updated Student: " + student1.getName() + " (ID: " + student1.getId() + ")");
        //OR
        student1.displayInfo();
    }
}