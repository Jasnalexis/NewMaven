package newSuper;

public class FirstProgram1 extends FirstProgram{
	
	public void display()
	{
		super.addNumb();
		System.out.println("hi"+super.x);
	}
	public static void main(String[] args) {
FirstProgram1 o=new FirstProgram1();
o.display();
//o.addNumb();
	}
}
