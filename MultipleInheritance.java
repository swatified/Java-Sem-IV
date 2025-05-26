interface Dad{
    public void money();
}

interface Mom{
    public void food();
}

class Child implements Mom, Dad{
    public void money(){
        System.out.println("I recieved 1000 rupees");
    }
    public void food(){
        System.out.println("I have eaten Pizza");
    }
}

class MultipleInheritance{
    public static void main(String [] args){
        Child c = new Child();
        c.money();
        c.food();
    }
}