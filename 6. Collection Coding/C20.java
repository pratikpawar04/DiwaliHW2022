import java.util.*;
class C20
{
	public static void main(String args[])
	{
	TreeSet<Integer> tree_no=new TreeSet<Integer>();
	TreeSet<Integer> treeheadset=new TreeSet<Integer>();
	tree_no.add(1);
	tree_no.add(2);
	tree_no.add(3);
	tree_no.add(4);
	tree_no.add(5);
	tree_no.add(6);
	tree_no.add(7);
	tree_no.add(8);
	tree_no.add(9);
	tree_no.add(10);
	tree_no.add(11);
	
	treeheadset = (TreeSet)tree_no.headSet(7);  

	
	Iterator iterator;
	iterator = treeheadset.iterator();
     
		System.out.println("Tree set data: ");  
		
	while (iterator.hasNext())
	{
	System.out.println(iterator.next() + " ");
	}
	
	}
}
/*
Tree set data:
1
2
3
4
5
6
*/