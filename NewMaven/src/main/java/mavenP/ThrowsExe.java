package mavenP;

import java.io.IOException;

public class ThrowsExe {
	public void method() throws IOException
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
		public static void main(String[] args) throws IOException {
	ThrowsExe ob = new ThrowsExe();	
	ob.method();
		}
}