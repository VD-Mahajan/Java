package Exception;

public class MoreAgeException extends Exception {

	public MoreAgeException() {
		super("MoreAgeException");	
	}
	public MoreAgeException(String str){
		super(str);
	}
}
