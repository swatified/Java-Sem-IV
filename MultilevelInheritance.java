class Parent{
    void run(){
        System.out.println("I am running");
    }
}
class Child extends Parent{
    void eat(){
        System.out.println("I ate food");
    }
}

class GrandChild extends Child {}

class MultilevelInheritance {
    public static void main(String[] args) {

        GrandChild g = new GrandChild();
        g.run(); // Inherited from Parent class
        g.eat(); // Inherited from Child class

    }
}