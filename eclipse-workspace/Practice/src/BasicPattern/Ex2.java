package BasicPattern;

public class Ex2 {

	public static void main(String[] args) {
		
		// *******
		//  *****
		//   ***
		//    *
		//	row-->4 , column-->7, space-->0
		
	   int Star=7;
	   int space=0;
	   for(int i=1;i<=7;i++)
	   {
		   for(int j=0;j<=space;j++)
			   
		   {
			   System.out.print(" ");
		   }
		     for(int k=1;k<=Star;k++)
		   {
			     System.out.print("*");
		   }
		     System.out.println();
		     space++;
		     Star--;
		     
		     
			      
	   }

	}

}
