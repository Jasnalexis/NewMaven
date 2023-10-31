package interfaceProgram;

public class InterfaceMultiple implements InterfaceP1,InterfaceP2{

	public static void main(String[] args) {
    InterfaceMultiple ob = new InterfaceMultiple();
    ob.addNum();
    ob.numb();
    ob.numb1();
    }
	@Override
	public void numb1() {
	System.out.println("hi");	
	}
	@Override
	public void addNum() {
	System.out.println("hey");	
	}
	@Override
	public void numb() {
    System.out.println("hii");	
	}
}
