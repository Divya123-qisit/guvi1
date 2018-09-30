/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class KADIG
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int k=sc.nextInt();
		int len=n.length();
		String s1="";
		for(int i=k;i<len;i++)
		s1+=n.charAt(i);
		System.out.println(s1);
	}
}
