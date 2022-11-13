import java.util.*;
class C15
{
	public static void main(String args[])
	{
	HashSet<String> h_set=new HashSet<String>();
	h_set.add("red");
	h_set.add("green");
	h_set.add("yellow");
	h_set.add("blue");
	h_set.add("violet");
	 
	Iterator<String> p = h_set.iterator();
	// Iterate the hash set
	while (p.hasNext()) {
	System.out.println(p.next());
	}
	
	}
}

/*
red
green
blue
yellow
violet
*/