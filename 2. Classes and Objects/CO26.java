class CO26
{
	public static void main(String args[])
	{
		//byte a=252;  //possible lossy conversion from int to byte
		byte a=(byte)252;  //range -128 to 127 //require typecast
		byte b=25; 
		//byte c=a+b;   //byte and short values during operation are upcast to int
		byte c=(byte)(a+b);  //downcast
		System.out.println("Byte value after addition is : "+c);
			
	}
	


}

/*
Output
Byte value after addition is : 21
*/