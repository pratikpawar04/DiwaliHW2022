import java.util.*;
class C17
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
    String[] new_array = new String[h_set.size()];
    h_set.toArray(new_array);
 
    // Displaying Array elements
    System.out.println("Array elements: ");
    for(String element : new_array){
    System.out.println(element);
     }
	
	}
}
/*
Original Hash Set: [red, green, blue, yellow, violet]
Array elements:
red
green
blue
yellow
violet
*/