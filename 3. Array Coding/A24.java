class A24
{	
	static void ssort(int a1[])
	{
		int n=a1.length;
		for(int i=0;i<n-1;i++)//pass
		{
			for(int j=i+1;j<n;j++)//internal iteration
			{
				if(a1[i]<a1[j])
				{	
					int temp=a1[j];
					a1[j]=a1[i];
					a1[i]=temp;
				}	
			}
		}
		
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
		int a[]={5,6,4,2,8,1,5};
		display(a);
		ssort(a);
		System.out.println("\n2nd Max no. is : "+a[1]);
	}

}

/*
Output:
--------
5 6 4 2 8 1 5
2nd Max no. is : 6
 */