/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumPre
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int sum=0,k=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			b[k]=sum;
			k++;
		}
		for(int i=0;i<n;i++)
		{
			if(n!=n-1)
			System.out.print(b[i]);
			else
			System.out.print(b[i]+" ");
		}
	}
}
