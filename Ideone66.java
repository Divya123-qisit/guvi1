import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone66
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			ans+=a[i]&a[j];
			
		}
		System.out.print(ans);
	}
}
