import java.util.*;
import java.lang.*;
import java.io.*;
class Sum92
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
