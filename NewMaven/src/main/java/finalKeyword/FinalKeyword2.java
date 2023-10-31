package finalKeyword;

public class FinalKeyword2 extends FinalKeyword1{
public final void method2() {                            //method cannot override+
	System.out.println("Final keyword)");
}
public static void main(String[] args) {
FinalKeyword2 o=new FinalKeyword2();
o.method2();
}
}
