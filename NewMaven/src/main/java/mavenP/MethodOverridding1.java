package mavenP;

public class MethodOverridding1 extends MethodOverridding{
public void overide(int a)
{
    super.overide(1);
	System.out.println("Hey");
}
	public static void main(String[] args) {
		MethodOverridding1 ob = new MethodOverridding1();
		ob.overide(10);
	}

}
