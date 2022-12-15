package inheritance;

public class singleLevelInheritance 

{
	public static void main(String[] args)
	{
		Mother m=new Mother();
		m.look();
		Mother.receipe();
		
		Daughter d=new Daughter();
		d.mobile();
		
		Daughter.scooty();
		
		d.look();
		Daughter.receipe();
		
		
		
		
	}
}
