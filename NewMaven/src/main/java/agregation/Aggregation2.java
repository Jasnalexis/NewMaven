package agregation;

public class Aggregation2 {
	String name;
	String place;
	Aggregation1 a;
	public Aggregation2(String name,String place,
	Aggregation1 a) {
		this.name=name;
		this.place=place;
		this.a=a;
	}
	public void display() {
		System.out.println(name+" "+place);
		System.out.println(a.id+" "+a.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aggregation1 o=new Aggregation1(123,"sdf");
Aggregation2 ob=new Aggregation2("asd","qwe",o);
ob.display();
	}
}
