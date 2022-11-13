import java.util.Scanner;

class P23
{
	
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j%2==0&&i%2!=0)
				{
					System.out.print(0+" ");
				}
				else if(j%2!=0&&i%2==0)
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

1 0 1 0 1 0 1
0 1 0 1 0 1 0
1 0 1 0 1 0 1
0 1 0 1 0 1 0
1 0 1 0 1 0 1
0 1 0 1 0 1 0
1 0 1 0 1 0 1

*/