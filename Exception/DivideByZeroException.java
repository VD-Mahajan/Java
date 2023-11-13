package Exception;

public class DivideByZeroException extends RuntimeException{
	
	public DivideByZeroException() {
		super("Exception caught");
	}
	
	public DivideByZeroException(String str){
		super(str);
	}
	
}
