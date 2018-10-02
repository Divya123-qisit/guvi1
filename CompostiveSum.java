import java.util.*;
import java.lang.*;
import java.io.*;
class CompostiveSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int sum=0,r=0;
		for(int i=0;i<n-1;i++)
		{
			r=a[i]+a[i+1];
			sum=sum+r;
		}
		System.out.println(sum);
	}
}
