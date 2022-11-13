class A5
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
		int a[]={5,6,4,2,8,1,5};
		display(a);
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("\nMaximum of Array : "+max);
		System.out.println("\n Minimum of  Array : "+min);
		
	}

}

/*
Output:
--------
5 6 4 2 8 1 5
Maximum of Array : 8

 Minimum of  Array : 1
*/