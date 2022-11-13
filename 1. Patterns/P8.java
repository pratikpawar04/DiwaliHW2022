import java.util.Scanner;

class P8
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No.");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			
			}
			System.out.println();
		}
		
		
		
	}


}


/*.

Enter a No.
5
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1

*/