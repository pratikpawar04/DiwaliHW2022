import java.util.*;

class A9
{	
	static int[] series(int a[])
	{
		int n=a.length;
		int x=1;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				a[i]=x*x*x;
			}
			else
			{
				a[i]=x*x;
			}
			x++;
		}
		return a;
	}	
		
		
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of element for series..");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("\nCurrent Array : ");
		display(a);
		a=series(a);
		System.out.println("\nNew Generated Series : ");
		display(a);
		System.out.println();
	}

}


/*
Output:
----------
Enter No. of element for series..
10

Current Array :
0 0 0 0 0 0 0 0 0 0
New Generated Series :
1 4 27 16 125 36 343 64 729 100

*/