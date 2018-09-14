import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
				Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int max=n-k;
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<max;i++)
		{
			if(i!=max-1)
			System.out.print(a[i]+" ");
			else 
				System.out.print(a[i]);
		
		}
	}
}
