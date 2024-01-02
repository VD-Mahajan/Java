package InnerClass;

class Outer3{
	
	static int i = 10;
	int j = 30;
	
	static class Inner{		//static is permitted only for Inner classes
		int c = 220;
		static void show() {
			System.out.println(i);
		}
	}
}

public class StaticInnerClass {
	
	public static void main(String[] args) {
		Outer3.Inner.show();
	}
}
