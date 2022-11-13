class A2
{
	public static void main(String args[])
	{
		int a[]={5,6,4,2,8,1};
		//int b[]={5,6,4,2,8,1};
		int b[]={5,6,4,2,8,5};
		int flag=0;
		if(a.length==b.length)
		{	
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					flag++;
				}
			}
		}
		else
		{
			flag++;	
		}
		
		if(flag!=0)
		{
			System.out.println("Arrays Not Equal..");
		}
		else
		{
			System.out.println("Arrays Equal..");
		}
		
	}

}

