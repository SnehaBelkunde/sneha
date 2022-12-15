package accessSpecifiers;

public class test2 {

	public static void main(String[] args)
	{
	 //i want to call variables and methods from another class 
		System.out.println("==========calling methods from another class================");
		
		Test t=new Test(); //creating object of test class 
		
		//t.m1();   //cant call private method from another class
		
		t.m2();
		t.m3();
		t.m4();
		
		System.out.println("===========calling variables from another class=========== ");
		
	//	System.out.println("calling private variable from another class "+t.a); cant call private variable from another class

		System.out.println("calling default variable from another class "+t.b);
		
		System.out.println("calling protected variable from another class "+t.c);
		
		System.out.println("calling public variable from another class "+t.d);
	}
	
}
