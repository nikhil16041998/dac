class P7{

public static void main(String args[]){
	
	for(int i=1;i<5;i++)//rows
	{
		for(int j=4;j>=i;j--)//space
		{
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++)//star
		{
			System.out.print("*");
			
		}
			for(int j=0;j<i-1;j++)//star
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	for(int i=0;i<5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
			
		}
		for(int j=i;j<=4;j++)
		{
			System.out.print("*");
			
		}
		for(int j=i;j<=3;j++)
		{
			System.out.print("*");
			
		}
		
		System.out.println();
	}
	}
	}