package finalKeyword;

public class FinalKeyword1 {
	final int a=10;
	public void method()
	{
		System.out.println(+a);
		
	}
	public final void method2() {
		System.out.println("Final keyword)");
	}

	public static void main(String[] args) {
FinalKeyword1 o=new FinalKeyword1();
o.method();
	}

}
