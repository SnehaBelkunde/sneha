package collection;

import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		TreeSet<Object> ts=new TreeSet<>();
		
		ts.add(6);
		ts.add(8);
		ts.add(4);
		ts.add(4);
		ts.add(9);
		//ts.add(0);
		ts.add(1);
		ts.add(5);
		//ts.add('t');
		//ts.add(null);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.floor(2));
		System.out.println(ts.floor(9));
		System.out.println(ts.floor(0));
		
		System.out.println(ts.higher(2));
		System.out.println(ts.higher(9));
		System.out.println(ts.lower(2));
		System.out.println(ts.lower(1));
	}
	}


