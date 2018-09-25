/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone100
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,count=0,a;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String x="";
		while(n!=0)
		{
			a=n%2;
			x=x+ "" +a;
			n=n/2;
		}
		StringBuilder sb=new StringBuilder(x);
	System.out.println(sb.reverse());
	}
}
