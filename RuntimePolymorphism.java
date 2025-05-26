class A{
    void display() {
        System.out.println("A is being displayed");
    }
}

class B extends A{
    void display() {
        System.out.println("B is being displayed!");
    }
}

class RuntimePolymorphism {
    public static void main(String[] args) {
        A ab = new B();
        ab.display(); // Calls B's display method due to dynamic method dispatch

        // This is an example of runtime polymorphism where the method to be called is determined at runtime
        // based on the object type (B) rather than the reference type (A).
    }
}