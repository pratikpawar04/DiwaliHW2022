import java.util.*;

class A8
{	
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		int a[]={5,14,35,89,140};
		int n=a.length;
		System.out.println("\nCurrent Array : ");
		display(a);
		if(n>2)
		{
			int avgArr[]=new int[n-2];
			System.out.println("\nNew Generated Series : ");
			for(int i=0;i<avgArr.length;i++)
			{
				avgArr[i]=(a[i]+a[i+1]+a[i+2])/3;
			}
			display(avgArr);
		}
		else
		{
			System.out.println("No. of input should be atleast 3...Try Again");
		}	
		System.out.println();
	}

}


/*
----------
Output:
----------
Current Array :
5 14 35 89 140
New Generated Series :
18 46 88

*/