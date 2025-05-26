class Happy{
    void smile() {
        System.out.println("I am smiling");
    }
}

interface Dance {
    void dance();
}

class Mood extends Happy implements Dance {
    public void dance() {
        System.out.println("Kathak");
    }
}

class HybridInheritance {
    public static void main(String[] args) {
        Mood m = new Mood();

        m.smile(); // Inherited from Happy class

        m.dance(); // Implemented from Dance interface
    }
}