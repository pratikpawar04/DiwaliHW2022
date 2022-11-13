import java.util.*;
class C16
{
	public static void main(String args[])
	{
	HashSet<String> h_set=new HashSet<String>();
	h_set.add("red");
	h_set.add("green");
	h_set.add("yellow");
	h_set.add("blue");
	h_set.add("violet");
	 
	System.out.println("Original Hash Set: " + h_set);
    // Remove all elements
    h_set.removeAll(h_set);
    System.out.println("Hash Set after removing all the elements "+h_set);  
	
	
	}
}

/*
Original Hash Set: [red, green, blue, yellow, violet]
Hash Set after removing all the elements []
*/