class Animal{
    void walks() {
        System.out.println("I am walking");
    }
}

class Dog extends Animal{}

class Bark extends Dog{
    void Bark(){
        System.out.println("Woof Woof");
    }
}

class Eat extends Dog{
    void eat(){
        System.out.println("Nom Nom");
    }
}

class Cat extends Animal{}

class Meow extends Cat{
    void meow(){
        System.out.println("Meww Meow");
    }
}

class Purr extends Cat{
    void purr(){
        System.out.println("Purr Purr");
    }
}

class HierarchialInheritance{
    public static void main(String [] args){}
}