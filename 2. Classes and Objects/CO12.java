class CO13
{
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
		CO13 obj=new CO13();
		System.out.println("Get Func with boolean return value called.."+obj.get());
		System.out.println("Static Get function with int return value called.."+get1());
		
	}
	
}



/*
Output:
-------
Get Func with boolean return value called..true
Static Get function with int return value called..100
*/