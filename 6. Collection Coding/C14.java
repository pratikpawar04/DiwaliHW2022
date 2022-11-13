import java.util.*;
public class C14
{
	public static void main(String args[])
	{
	LinkedList<String> l_list1=new LinkedList<String>();
	l_list1.add("red");
	l_list1.add("green");
	l_list1.add("yellow");
	l_list1.add("blue");
	l_list1.add("violet");
	
	 System.out.println("Original linked list: " + l_list1);
	// Replacing 2nd element with new value
    l_list1.set(1, "Orange");
    System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + l_list1);
	
	}
}

/*
Original linked list: [red, green, yellow, blue, violet]
The value of second element changed.
New linked list: [red, Orange, yellow, blue, violet]
*/