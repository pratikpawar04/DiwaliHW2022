class CO25
{
	CO25()
	{
		System.out.println("COnstructor Called..");
	}
	
	static
	{
		System.out.println("Static Block 1 Called..");
	}
	
	{
		System.out.println("Instance Block 2 Called.. ");
	}
		
	{
		System.out.println("Instance Block 1 Called.. ");
	}	
	
	static
	{
		System.out.println("Static Block 2 Called..");
	}
	
	
	void display()
	{
		System.out.println("Display FUnction Called..");
	}
	
	public static void main(String args[])
	{
		CO25 obj=new CO25();
		obj.display();	
	}
	
}



/*
Output:
-------
Static Block 1 Called..
Static Block 2 Called..
Instance Block 2 Called..
Instance Block 1 Called..
COnstructor Called..
Display FUnction Called..

*/