import java.util.*;

class A18
{	
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	static void checkRep(int a[])
	{
		int n=a.length;
		int count=0;
		label:
		for(int i=0;i<n-1;i++)
		{	
			count=1;
			for(int k=i-1;k>=0;k--)
			{
				if(a[k]==a[i])
				{
					continue label;
				}
			}
			for(int j=i+1;j<n;j++)	
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>1)	
			{
				System.out.println(a[i]+" : "+count);
			}
		}
		
		
	}
	
	public static void main(String args[])
	{
		int a[]={1,1,1,1,2,2,2,3,3,3,3,3,4,4,5,5,5,5,6};
		int n=a.length;
		System.out.println("\nCurrent Array : ");
		display(a);
		System.out.println();
		System.out.println("\nRepititions : ");
		checkRep(a);
		System.out.println();
	}

}


/*
----------
Output:
----------
Current Array :
1 1 1 1 2 2 2 3 3 3 3 3 4 4 5 5 5 5 6

Repititions :
1 : 4
2 : 3
3 : 5
4 : 2
5 : 4

*/