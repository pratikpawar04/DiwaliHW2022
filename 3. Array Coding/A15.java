// find missing no. between 1 to 100
//program is prepared for no. 1 to 10
// same will go for 1-100
/*
-Calculate the sum of the first n natural numbers as sumtotal= n*(n+1)/2.
-Create a variable sum to store the sum of array elements.
-Traverse the array from start to end.
-Update the value of sum as sum = sum + array[i]
-Print the missing number as sumtotal – sum.
*/

import java.util.*;

class A15
{	
	
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		int a[]=new int[10];
		int n=a.length;
		a[0]=5;
		a[1]=6;
		a[2]=3;
		a[3]=2;
		a[5]=1;
		a[6]=9;
		a[7]=10;
		a[8]=8;
		a[9]=4;
		int sumN=(n*(n+1))/2;
		int sum=0;
		display(a);
		System.out.println("\n\nSum of N Numbers from 1-10.."+sumN);
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("\nMissing value : "+(sumN-sum));
	}

}

/*
Output:
5 6 3 2 0 1 9 10 8 4

Sum of N Numbers from 1-10..55

Missing value : 7
 */