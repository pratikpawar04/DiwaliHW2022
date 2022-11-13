import java.util.*;

class A10
{	
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	static void check(int x[])
	{
		int count1=1;   //comparisons n-1
		int count2=1;
		
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]>x[i+1])
			{
				count1++;
			}
			if(x[i]<x[i+1])
			{
				count2++;
			}
		}
		if(count1==x.length)
		{
			System.out.println(" : Descending");	
		}
		else if(count2==x.length)
		{
			System.out.println(" : Ascending");	
		}
		else
		{
			System.out.println(" : Random");
		}
		
	}
	
	public static void main(String args[])
	{
		int a[]={5,14,35,90,139};
		int b[]={88,67,35,14,-12};
		int c[]={65,14,129,34,7};
		int n1=a.length;
		int n2=b.length;
		int n3=c.length;
		System.out.println("\nCurrent Array a[]: ");
		display(a);
		check(a);
		System.out.println("\nCurrent Array b[]: ");
		display(b);
		check(b);
		System.out.println("\nCurrent Array c[]: ");
		display(c);
		check(c);
		System.out.println();
	}	

}


/*
----------
Output:
----------

Current Array a[]:
5 14 35 90 139  : Ascending

Current Array b[]:
88 67 35 14 -12  : Descending

Current Array c[]:
65 14 129 34 7  : Random

*/