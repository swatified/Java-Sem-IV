class Parent{
    void run(){
        System.out.println("I am running");
    }
}
class Child extends Parent{}

class SingleInheritance {
    public static void main(String[] args) {

        Child c = new Child();
        c.run();
        
    }
}