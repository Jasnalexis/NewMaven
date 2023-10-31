package mavenP;

public class TryException {
public void method()
{
	try 
	{
		int a=10/0;
		System.out.println(a);
	}
	/*catch(ArithmeticException e)
	{
		System.out.println("Welcome "+e);
	}*/
		finally
		{
			System.out.println("hi");
		}
}
	public static void main(String[] args) {
TryException ob = new TryException();
ob.method();
	}

}
