import java.util.*;
class C18
{
	public static void main(String args[])
	{
	HashSet<String> h_set1=new HashSet<String>();
	h_set1.add("red");
	h_set1.add("green");
	h_set1.add("yellow");
	HashSet<String> h_set2=new HashSet<String>();
	h_set2.add("blue");
	h_set2.add("violet");
	h_set2.add("yellow");
	 
	System.out.println("Second HashSet LIST: "+h_set2);
		h_set1.retainAll(h_set2);
			System.out.println("HashSet LIST:");
			System.out.println(h_set1);
	
	}
}
/*
Second HashSet LIST: [blue, violet, yellow]
HashSet LIST:
[yellow]
*/