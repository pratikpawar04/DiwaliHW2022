class A4
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
		int a[]={5,6,4,2,8,1};
		int b[]=new int[a.length];
		display(a);
		for(int i=0;i<a.length;i++)
		{
			b[a.length-1-i]=a[i];
		}
		System.out.println("\nAfter Reversing Array : ");
		display(b);
		
	}

}

/*
Output:
--------
(5+1)
(4+2)
*/