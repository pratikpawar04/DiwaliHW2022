
public class A11  
{  
	public static void main(String args[])   
	{  
		try  
		{  
			byte[] bytes = "hello world".getBytes();  
			String s = new String(bytes);     
			System.out.println(s);  
		}  
			catch(Exception e)  
		{  
				e.printStackTrace();  
		}  
	}  
} 

/*
hello world
*/