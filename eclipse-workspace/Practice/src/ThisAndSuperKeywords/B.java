package ThisAndSuperKeywords;

public class B extends UseSuperKeyword 

{
	int x=500;
	public static void main(String[] args) 
	{
		B b=new B();
		b.display();

	}
	
	public void display()
	{
		int x=300;
		System.out.println("accessing local variable from same class "+x);
		System.out.println("accessing global variable from same class "+this.x);
		
		System.out.println("accessing global variable from super class "+super.x);
	}
	

}
