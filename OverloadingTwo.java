class OverloadingTwo{
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        OverloadingTwo o = new OverloadingTwo();

        o.add(2, 3); // Calls the first add method
        o.add(4, 5.5); // Calls the second add method
        
    }
}