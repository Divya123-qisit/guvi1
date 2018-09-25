/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone88
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int decimal=0,p=0;
		while(n!=0)
		{
			decimal+=((n%10)*Math.pow(2,p));
			n=n/10;
			p++;
		}
		System.out.print(decimal);
	}
}
