package mavenP;

public class Abstraction1 extends Abstraction{

	@Override
	public void main() {
System.out.println("abstract method");		
	}
public static void main(String[] args) {
	Abstraction1 ob = new Abstraction1();
	ob.main();
	ob.method();
	}
}
