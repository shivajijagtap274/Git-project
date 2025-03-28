package UserdefinedException;

public class InsufficientFundException extends RuntimeException{

	
	String message;
	
	public InsufficientFundException(String message) {
		super(message);
	}
}
