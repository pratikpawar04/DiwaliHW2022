import java.util.*;
class C5
{
	public static void main(String args[])
	{
	List<String> list_Strings=new ArrayList<String>();
	list_Strings.add("red");
	list_Strings.add("green");
	list_Strings.add("yellow");
	list_Strings.add("blue");
	list_Strings.add("violet");
	System.out.println(list_Strings);
	System.out.println("List before reversing :\n" + list_Strings);  
	Collections.reverse(list_Strings);
	System.out.println("List after reversing :\n" + list_Strings); 
		
	}
}
/*
[red, green, yellow, blue, violet]
List before reversing :
[red, green, yellow, blue, violet]
List after reversing :
[violet, blue, yellow, green, red]
*/