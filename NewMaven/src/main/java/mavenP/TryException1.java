package mavenP;

public class TryException1 {
	public void method()
	{
		int a[]= {1,2,3,4,5};
		try 
		{
			System.out.println(a[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException f)
		{
	     System.out.println(f);
		}
	catch(Exception e)
	{
		System.out.println("Welcome "+e);
	}
	}
		public static void main(String[] args)
		{
	TryException1 ob = new TryException1();
	ob.method();
		}
}
