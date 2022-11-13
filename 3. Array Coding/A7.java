import java.util.*;

class A7
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
		int a[]={23,60,94,3,102};
		int b[]={42,16,74};
		int n1=a.length;
		int n2=b.length;
		System.out.println("\nCurrent Array a[]: ");
		display(a);
		System.out.println("\nCurrent Array b[]: ");
		display(b);
		System.out.println();
		System.out.println("\nMerging Two Arrays : ");
		int c[]=new int[n1+n2];
		int k=0;
		for(int i=0;i<n1;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<n2;i++)
		{
			c[k]=b[i];
			k++;
		}
		display(c);
		System.out.println();
	}

}


/*
----------
Output:
----------
Current Array a[]:
23 60 94 3 102
Current Array b[]:
42 16 74

Merging Two Arrays :
23 60 94 3 102 42 16 74
*/