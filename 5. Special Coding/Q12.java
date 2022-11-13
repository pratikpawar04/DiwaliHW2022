import java.util.*;

class Q12
{
	static final int MAX_CHAR = 256;

	static void repeatingChar(String str)
	{
		int count[] = new int[MAX_CHAR];

		int len = str.length();

		for (int i = 0; i < len; i++)
		{
			count[str.charAt(i)]++;
		}

		char ch[] = new char[str.length()];
		
		for (int i = 0; i < len; i++) 
		{
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) 
			{
				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println(str.charAt(i)+ " appears " + count[str.charAt(i)]+ " times ");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = sc.next();
		
		repeatingChar(str);
	}
}

/*
Enter a string
Mississippii
M appears 1 times
i appears 5 times
s appears 4 times
p appears 2 times

Enter a string
Kirloskar
K appears 1 times
i appears 1 times
r appears 2 times
l appears 1 times
o appears 1 times
s appears 1 times
k appears 1 times
a appears 1 times

*/