/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class IdeonePro3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int c1=0,c2=0,sum1=0,sum2=0,avg1=0,avg2=0,k;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		k=n/2;
		for(int i=0;i<k;i++)
		{
			sum1+=a[i];
			c1++;
		}
		avg1=sum1/c1;
		for(int i=k;i<n;i++)
		{
			sum2+=a[i];
			c2++;
		}
		avg2=sum2/c2;
		if(avg1==avg2)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
