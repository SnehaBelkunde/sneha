package inheritance;

public class MultilevelInheritanc {

	public static void main(String[] args)
	{

		GrandFather g=new GrandFather();
		g.stories();
		GrandFather.experince();
		
		Father f=new Father();
		f.nature();
		Father.money();
		
		Son s=new Son();
		s.bike();
		Son.mobile();
		 
		Father.experince();
		Son.money();
		
		f.stories();
		s.nature();
		
		f.experince();
		s.experince();
		s.mobile();
		
		s.stories();
		Son.experince();
		
	}
	
	

}
