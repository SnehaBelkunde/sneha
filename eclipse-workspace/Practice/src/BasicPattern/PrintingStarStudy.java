package BasicPattern;

public class PrintingStarStudy {

	public static void main(String[] args)
	{
		//*
		//**
		//***
		//****
		//*****
		//******
		
		// row-->6,column-->
		
	 int n=6;
	 
	 for(int i=1;i<=n;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print("*");
			 
		 }
		 System.out.println();
		 
	 }
	}

}
