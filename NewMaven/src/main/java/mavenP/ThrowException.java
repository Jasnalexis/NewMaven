package mavenP;

public class ThrowException {
	public void method()
	{
		int a = 20;
		if(a>18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			throw new ArithmeticException("Welcome");
		}
	}
		public static void main(String[] args) {
	ThrowException ob = new ThrowException();	
	ob.method();
		}
}
