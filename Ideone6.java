import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==x)
				count++;
			}
		}
		if(count>0)
		System.out.println("yes");
		else
		System.out.println("no");

	}
}
