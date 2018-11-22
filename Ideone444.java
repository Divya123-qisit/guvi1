/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone444
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		long d=(long)Math.pow(a,b);
		long e=(long)d%c;
		System.out.println(e);
		
	}
}
