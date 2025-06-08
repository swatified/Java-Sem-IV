class Throw {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or above");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}