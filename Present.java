import java.util.*;
import java.lang.*;
import java.io.*;
class Present
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
			count++;
			}
		}
		if(count>0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
