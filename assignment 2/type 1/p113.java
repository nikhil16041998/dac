class P13{

public static void main(String args[]){
	
	for(int i='A';i<='E';i++)
	{
		for(int j='E';j>=i;j--)
		{
			System.out.print(" ");
			
		}
		for(int j='A';j<=i;j++)
		{
			System.out.print(" "+(char)i);
			
		}
		
		System.out.println();
	}
}
}