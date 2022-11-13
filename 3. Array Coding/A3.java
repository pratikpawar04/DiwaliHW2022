class A3
{
	public static void main(String args[])
	{
		int a[]={5,6,4,2,8,1};
		int checksum=6;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
					if((a[i]+a[j])==checksum)
					{
						System.out.println("("+a[i]+"+"+a[j]+")");
					}
			}
		}
		
	}

}

/*
Output:
--------
(5+1)
(4+2)
*/