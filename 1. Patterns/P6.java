import java.util.Scanner;

class P6
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No.");
		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
	}


}


/*.

Enter a No.
5
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/