/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class UptoLo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		char c[]=str.toCharArray();
		for(int i=0;i<len;i++)
		{
			if(Character.isUpperCase(c[i]))
				System.out.print(Character.toLowerCase(c[i]));
			if(Character.isLowerCase(c[i]))
				System.out.print(Character.toUpperCase(c[i]));
		}
	}
}
