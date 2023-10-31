package interfaceProgram;

public class InterfaceP3 implements InterfaceP1{

	public void display() {
		System.out.println("Class");
	}
	public static void main(String[] args) {
    //InterfaceP3 ob = new InterfaceP3();
	InterfaceP1 ob = new InterfaceP3();
	ob.addNum();
	ob.numb();
	//ob.display();
	ob.numb1();
	}
	@Override
	public void numb1() {
	    System.out.println("InterfaceP3");
	}
	@Override
	public void addNum() {
		int c=a+b;
		System.out.println(c);
	}
	@Override
	public void numb() {
		int c=a-b;
		System.out.println(c);
	}
}
