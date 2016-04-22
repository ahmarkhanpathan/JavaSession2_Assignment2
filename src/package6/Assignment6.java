package package6;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// To print prime numbers 1 to 100
		
		System.out.println("Following are the Prime Numbers between 1 to 100");
	
		for (int i=1;i<=100;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if (j==i)
				{
					System.out.print(i+" ");
				}
			
			if (i%j==0)
			{
				break;
			}
			}
				
		}
	}
}