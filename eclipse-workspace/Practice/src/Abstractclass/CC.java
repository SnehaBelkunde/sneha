package Abstractclass;

public class CC extends Test
{

	public static void main(String[] args) 
	{
		CC c=new CC();//creating 
		c.t1();
		c.t2();
		c.t3();
		
	}

	@Override
	public void t1()//compliting incomplete t1 method from abstract class
	{
		System.out.println("t1 completed in cc class");		
	}
	public void t3()
	{
		System.out.println(" complet cc class method");
		
	}


}
