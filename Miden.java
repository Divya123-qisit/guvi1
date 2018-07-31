import java.util.*;
import java.lang.*;
import java.io.*;
class Miden
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int med;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		med=sum/n;
		System.out.println(med);
		
		
		
	}
}
