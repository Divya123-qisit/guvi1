import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone7
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[1]-a[0];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[j]-a[i]<max)
				max=a[j]-a[i];
			}
		}
		System.out.print(max);
	}
}
