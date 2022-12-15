package ThisAndSuperKeywords;

public class UseThiskeyword {

	int a=100;
	int y=10;
	static int z=30;
	
	public static void main(String[] args) 
	{
		UseThiskeyword  us=new UseThiskeyword();
		us .test();

	}
	
	public  void test()
	{
		int x=20;
		int y=40;
		int z=50;
		System.out.println("access local variable "+x);
		System.out.println("access local variable "+y);
		System.out.println("access local variable "+z);
		System.out.println("access global variable from current class "+a);
		System.out.println("access global variable from current class "+this.y);
		System.out.println("access global static variable from current class "+this.z);
	}

}
