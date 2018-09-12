import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			count++;
		}
		System.out.println(count);
		
	}
}
