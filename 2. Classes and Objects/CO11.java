class CO11
{
	static void display1()
	{
		System.out.println("Static Display Function called..");
	}
	
	void display()
	{
		System.out.println("Display Function called..No Values Returned");
	}
	
	boolean get()
	{
		return true;
	}
	
	static int get1()
	{
		return 100;
	}
	
	public static void main(String args[])
	{
		CO11 obj=new CO11();
		obj.display();
		display1();
		System.out.println("Get Func with boolean return value called.."+obj.get());
		System.out.println("Static Get function with int return value called.."+get1());
		
	}
	
}



/*
Output:
-------
Display Function called..No Values Returned
Static Display Function called..
Get Func with boolean return value called..true
Static Get function with int return value called..100
*/