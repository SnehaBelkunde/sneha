package String;

public class splitStudy {

	public static void main(String[] args) {
		
		String s=new String("Welcome to home");
		System.out.println(s);
		
		String[] st=(s.split(" "));
		
		System.out.println(st[0]);
		System.out.println(st[1]);
		System.out.println(st[2]);
		
		System.out.println("==============");
		String[] s1=(s.split("to"));
		System.out.println(st[0]);
		System.out.println(st[1]);
		
		
		
		
	}

}
