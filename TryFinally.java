class TryFinally {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}