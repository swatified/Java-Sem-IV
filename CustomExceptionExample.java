class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
    
    static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age is below 18");
        }
    }
}
