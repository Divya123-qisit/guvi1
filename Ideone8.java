import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			if(i!=n-1)
			{
				if(a[i]>a[i+1])
				System.out.print(a[i]+" ");
				else
				System.out.print(a[i+1]+" ");
			}
			else{
			if(a[i]>a[i+1])
				System.out.print(a[i]);
				else
				System.out.print(a[i+1]);
			}
			

		}
	}
}
