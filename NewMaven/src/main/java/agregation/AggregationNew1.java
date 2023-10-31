package agregation;

public class AggregationNew1 {
	String name;
	int rollno;
	String address;
	AggregationNew a;
	public AggregationNew1(String name,int rollno,String address,AggregationNew a)
	{
		this.name=name;
	    this.rollno=rollno;
		this.address=address;
		this.a=a;		
	}
	public void display()
	{
		System.out.println(name+" "+rollno+" "+address);
		System.out.println(a.name+" "+a.rollno);
	}
		public static void main(String[] args) {
	AggregationNew o=new AggregationNew("ascv",789);
	AggregationNew1 ob=new AggregationNew1("anu",56,"kerala",o);
	ob.display();

	}
}
