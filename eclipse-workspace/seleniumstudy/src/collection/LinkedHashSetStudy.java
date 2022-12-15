package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
	    LinkedHashSet<Object> lhs=new  LinkedHashSet<>();
	    lhs.add("Pune");
		lhs.add(1234);
		lhs.add(null);
		lhs.add('n');
		lhs.add(true);
		lhs.add(null);
		System.out.println(lhs);
		lhs.add('m');
		System.out.println(lhs);
		System.out.println(lhs.contains(1234));
		lhs.clone();
		System.out.println(lhs);
		//lhs.clear();
		//System.out.println(lhs);
		lhs.add("Latur");
		System.out.println(lhs);
	}

}
