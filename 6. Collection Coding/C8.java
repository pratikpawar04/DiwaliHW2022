import java.util.*;
public class C8
{
	public static void main(String args[])
	{
	List<String> strings_list1=new ArrayList<String>();
	strings_list1.add("red");
	strings_list1.add("green");
	strings_list1.add("yellow");
	strings_list1.add("blue");
	
	System.out.println(strings_list1);
	strings_list1.add("orange");
	System.out.println("list after add orange" +strings_list1);
	}
}

/*
[red, green, yellow, blue]
list after add orange[red, green, yellow, blue, orange]
*/