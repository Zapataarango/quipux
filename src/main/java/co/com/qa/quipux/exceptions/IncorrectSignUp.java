package co.com.qa.quipux.exceptions;

public class IncorrectSignUp extends AssertionError {

    public static final String FAILED_SIGN_UP = "AN ERROR OCURRED WHILE CREATING THE ACCOUNT";

    public IncorrectSignUp(String message, Throwable testErrorException ) {
        super(message,testErrorException);
    }
}
