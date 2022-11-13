class A19
{	
	static void sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)//pass
		{
			sum=sum+a[i];
		}
		
		System.out.println("\nSum of all Values : "+sum);
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
		sum(a);
	}

}

/*
Output:
5 6 4 2 8 1 5
Sum of all Values : 31
 */