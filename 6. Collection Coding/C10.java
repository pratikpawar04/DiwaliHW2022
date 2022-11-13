import java.util.*;
public class C10
{
	public static void main(String args[])
	{
	LinkedList<String> l_list=new LinkedList<String>();
	l_list.add("red");
	l_list.add("green");
	l_list.add("yellow");
	l_list.add("blue");
	l_list.add("violet");
	System.out.println(l_list);
	
	System.out.println("Original linked list:" + l_list);    
   
    l_list.addFirst("White");
    l_list.addLast("Pink");
	
    System.out.println("Final linked list:" + l_list); 
	
	}
}

/*
[red, green, yellow, blue, violet]
Original linked list:[red, green, yellow, blue, violet]
Final linked list:[White, red, green, yellow, blue, violet, Pink]
*/