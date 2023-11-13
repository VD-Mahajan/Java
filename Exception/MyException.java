package Exception;

public class MyException {
	
	private static int divide(int a,int b) {
		
		if(b==0)
			throw new DivideByZeroException("DivideByZeroException");
		
		return a/b;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(divide(10,0));			
		}catch(DivideByZeroException d) {
			System.out.println(d.getMessage()+" Caught ");
		}
	}
}
