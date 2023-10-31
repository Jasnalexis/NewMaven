package newSuper;

public class ThirdProgram1 extends ThirdProgram {

	public void display() {
		 super.addNum();
		System.out.println(super.c);
		int x=c/10;
		System.out.println(x);
	}

	public static void main(String[] args) {
		ThirdProgram1 o=new ThirdProgram1();
        o.display();
       // System.out.println(o.addNum());
	}
}
	