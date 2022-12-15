package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListUse
{

	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<>();
		
	    al.add("Velocity");
		al.add(123);
		al.add("pune");
		al.add("null");
		al.add("as");
		al.add("null");
		System.out.println(al);
		al.add(1,"Mumbai");
		System.out.println(al);
		
		LinkedList<Object> ll=new LinkedList<>();
		ll.add("Velocity");
		ll.add(123);
		ll.add("pune");
		ll.add("null");
		ll.add("as");
		ll.add("null");
		
		//Object j1 = ll.peek();
		//System.out.println(j1);
		
		Object j2 = ll.pop();
		
		System.out.println(j2);
		System.out.println(ll);
		
		System.out.println(ll.peek());
		
		System.out.println(ll.size());
		System.out.println(al);
		
		System.out.println(ll.peekFirst());
		
		System.out.println(ll);
		
		System.out.println(ll.peekLast());
		System.out.println(ll);
		
		ll.push("Mumbai");
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		

		System.out.println(ll);
		
		ll.remove("Mumbai");

		System.out.println(ll);
		
		ll.add(1,'n');

		System.out.println(ll);
		//Object li1 = ll.clone();

		//System.out.println(li1);
		
		ll.contains("Mumbai");
		System.out.println(ll);
		

		System.out.println(ll.contains("pune"));
		System.out.println(ll.contains('n'));
		System.out.println(ll.contains(123));
		System.out.println(ll.contains("Mumbai"));
		
		System.out.println(ll.indexOf("pune"));
		System.out.println(ll);
		System.out.println(ll.get(4));
		
		System.out.println("==========for loop=============");
		for(int i=0;i<=ll.size()-1;i++)
		{	
		  System.out.println(ll.get(i));
		}
		System.out.println("==========for each=============");
		for(Object l:ll)
		{
			System.out.println(l);
		}
		System.out.println("==========iterator=============");
		
		Iterator<Object>it1=ll.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
			
		}	
	}

			
	}


