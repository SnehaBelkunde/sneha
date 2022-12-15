package String;

public class ReverseStringEx
{
	public static void main(String[] args)
	{
	    String s="Welcome to java";
	    String s1="";
	    
	   // System.out.println(s);

		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
}
			
