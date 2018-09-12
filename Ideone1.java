import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			if(a[j]<n)
			{
				System.out.print(a[j]+" ");
			}
		}
	}
}
