package programs.exceptions;

public class CheckAgeCustomException{

    public static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException(1001, "Age must be 18 or older to register.");
        }
        if (age > 120) {
            throw new InvalidAgeException(1002, "Age seems unrealistic. Please check and try again.");
        }
        System.out.println("Age validation passed.");
    }


    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (InvalidAgeException ex) {
            System.err.println("Error Code: " + ex.getErrorCode());
            System.err.println("Error Message: " + ex.getMessage());
        }
    }
}

class InvalidAgeException extends RuntimeException {
    private final int errorCode;

    public InvalidAgeException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
