package Exception;

public class AgeExceptionDemo {
	
	private static boolean isValid(int age) throws MoreAgeException ,LowerAgeException{
		
		if(age>100)
			throw new MoreAgeException("Age is more than 100");
		else if(age<0)
			throw new LowerAgeException();
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int age = 133;
		
		try {
			if(isValid(age))
				System.out.println("Age is validated");			
		}catch(MoreAgeException mae) {
			System.out.println(mae.getMessage());
		}catch(LowerAgeException lae) {
			lae.printStackTrace();
		}
		
	}
}
