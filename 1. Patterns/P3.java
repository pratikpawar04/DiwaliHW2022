import java.util.Scanner;

class P3
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No.");
		int x=sc.nextInt();
		int sum=0;
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				sum++;
				System.out.print(sum+" ");
				
			
			}
			System.out.println();
		}
		
		
		
	}


}


/*.

Enter a No.
5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/