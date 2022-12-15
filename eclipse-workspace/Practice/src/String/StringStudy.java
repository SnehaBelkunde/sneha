package String;

public class StringStudy {

	public static void main(String[] args)
	{
		String s=new String("Welcome to pune");
		System.out.println(s);
	
	System.out.println("==========print all character=========");	
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i));
	}
		
	System.out.println("==========print all character in reverse order=========");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
