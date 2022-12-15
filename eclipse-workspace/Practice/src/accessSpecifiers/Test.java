package accessSpecifiers;

public class Test 
{
	  int a=10;
	 static   int b=20;
	protected int c=30;
	public int d=40;
	
	public static void main(String[] args)
	
	{
		Test t= new Test();
		
		t.m1();
		t.m2();
		t.m3();
		
		System.out.println("calling private variable a from same class "+t.a);
		
		System.out.println("calling Default variable b from same class "+t.b);
		
		System.out.println("calling protected variable c from same class "+t.c);
		
		System.out.println("calling public variable d from same class "+t.d);
	}
	
	private void m1()
	{
		System.out.println("private method m1 from test class" +a);
		System.out.println("accessing static global variables from test class " +b);
		System.out.println("private method m1 from test class");
		
	}
	void m2()
	{
		System.out.println("default method m2 from test class");
		
	}
	protected void m3()
	{
		System.out.println("protected method m3 from test class");
		
	}
	public void m4()
	{
		System.out.println("public method m4 from test class");
		
	}

}
