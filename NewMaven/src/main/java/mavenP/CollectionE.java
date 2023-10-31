package mavenP;

import java.util.ArrayList;

public class CollectionE {
	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(50);
		ob.add(75);
		ob.add(100);
		System.out.println(ob);
		System.out.println(ob.contains(400));
		System.out.println(ob.get(1));
		System.out.println(ob.size());
		ob.removeAll(ob);
		System.out.println(ob);
		}
}
