package collection;

import java.util.HashSet;
import java.util.Iterator;

import org.checkerframework.checker.units.qual.h;

public class HashSetStudy {

	public static void main(String[] args) 
	{
	
		HashSet<Object> hs=new HashSet<>();
		
		hs.add("Pune");
		hs.add(1234);
		hs.add(null);
		hs.add('n');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		//hs.clear();
		System.out.println(hs.isEmpty());

		System.out.println(hs);
		Object hs1 = hs.clone();
		System.out.println(hs1);
		
		System.out.println(hs.contains(1234));
		System.out.println(hs.size());
		
		//for loop is not used in hashset
		
		System.out.println("===============for each loop==============");
		for(Object h:hs)
		{
			System.out.println(h);
			
		}
		System.out.println("==============iterator==============");
		
		Iterator<Object>it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}	
	}

}
