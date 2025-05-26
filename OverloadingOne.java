class OverloadingOne{
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        OverloadingOne o = new OverloadingOne();
        System.out.println(o.add(2,3));
        System.out.println(o.add(4,5,9));
    }
}