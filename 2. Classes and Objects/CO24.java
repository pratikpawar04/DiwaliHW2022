class CO24
{
	static int s;
	
	void display()
	{
		s++;
	}
	
	public static void main(String args[])
	{
		CO24 obj=new CO24();
		CO24 obj1=new CO24();
		CO24 obj2=new CO24();
		System.out.println("s after initialisation.."+s);
		obj.display();
		obj.display();
		System.out.println("s after 2 display calls.."+s);
		obj1.display();
		obj2.display();
		obj2.display();
		obj.display();
		System.out.println("s after 6 display calls.."+s);
		
	}
	
}



/*
Static is coomon Variable which is shared by all objects
Single copy of static is created in memory  and shared by all objects
Static variables are initialised by JVm before program execution starts 

Output:
-------
s after initialisation..0
s after 2 display calls..2
s after 6 display calls..6

*/