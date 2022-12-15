package Abstractclass;

public class Honda extends Bike {

	public static void main(String[] args)
	{
		Honda h=new Honda();
		h.Jupitor();
		h.Activa();
		//h.pept();
		h.unicorn();
		
		Bike.pept();

	}
	public void Jupitor()
	{
		System.out.println("Jupitor is complete method from Honda class");
		
	}
	@Override
	public void Activa()
	{
		System.out.println("compliting Activa method from Bike class");
		
	}

}
