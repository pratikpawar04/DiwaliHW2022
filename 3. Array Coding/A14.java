import java.util.*;

class A14
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
		//int a[]={1,2,4,8,16,32,64}; //output1
		//int a[]={1,2,4,8,16,32};   //output2
		int a[]={1,2,4,8,16,32,64};  //output3
		int n1=a.length;
		System.out.println("No. of Element is array a[] : "+n1+" & Elements are as follows");
		display(a);
		//int b[]={1,2,4,8,16,32,64};  //output1
		//int b[]={1,2,4,8,16,64};   //output2
		int b[]={1,2,4,8,17,32,64};   //output3
		int n2=b.length;
		System.out.println("\nNo. of Element is array b[] : "+n2+" & Elements are as follows");
		display(b);
		
		int count=0;
		
		if(n1==n2)
		{
			for(int i=0;i<n1;i++)
			{
				if(a[i]==b[i])
				count++;
			}				
		}
		if(count==n1)
		{
			System.out.println("\n\nBoth the arrays are equal..\n");
		}
		else
		{
			System.out.println("\n\nBoth the arrays are not equal..\n");
		}
		
	}

}

/*
----------
Output:1
----------

No. of Element is array a[] : 7 & Elements are as follows
1 2 4 8 16 32 64
No. of Element is array b[] : 7 & Elements are as follows
1 2 4 8 16 32 64

Both the arrays are equal..

----------
Output:2
-----------

No. of Element is array a[] : 6 & Elements are as follows
1 2 4 8 16 32
No. of Element is array b[] : 6 & Elements are as follows
1 2 4 8 16 64

Both the arrays are not equal..

----------
Output:3
----------
No. of Element is array a[] : 7 & Elements are as follows
1 2 4 8 16 32 64
No. of Element is array b[] : 7 & Elements are as follows
1 2 4 8 17 32 64

Both the arrays are not equal..

 */