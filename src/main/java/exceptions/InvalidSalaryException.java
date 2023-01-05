package exceptions;

public class InvalidSalaryException extends Exception{
    public static final String STANDARD_MESSAGE = "The passed salary is invalid";
    public InvalidSalaryException(String message) {
        super(message);
    }
}
