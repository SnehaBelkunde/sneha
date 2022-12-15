package acsSpec;

import accessSpecifiers.Test;

public class Test3 extends Test
{

	public static void main(String[] args) 
	{
	
		Test t=new Test(); //create obj of another class
		
		System.out.println("========Calling methods from another package========");
		
		t.m4();
		
		System.out.println("=======Calling variables from another package========");
		
		System.out.println("calling public variable d from another package "+t.d);
		
		System.out.println("=========access protected and public methods from super class using object of sub class  ===========");
		Test3 t3=new Test3();
		
		t3.m3();
		t3.m4();
		
		System.out.println("Calling protected variable c from super class using object of sub class "+t3.c);
		
		System.out.println("Calling public variable d from super class using object of sub class "+t3.d);
		
		
	}

}
