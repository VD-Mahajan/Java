package Exception;

public class LowerAgeException extends Exception{

	public LowerAgeException() {
		super("AgeInvalidException");
	}
	public LowerAgeException(String str) {
		super(str);
	}
}
