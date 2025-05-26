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

class Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.display(); // Calls A's display method

        B b = new B();
        b.display(); // Calls B's display method, overriding A's display method

    }
}