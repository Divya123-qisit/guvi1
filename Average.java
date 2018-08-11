import java.util.*;
import java.lang.*;
import java.io.*;
class Average
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0,aver;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for( int i=0;i<n;i++)
		{
		  arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		aver=sum/n;
		System.out.println(aver);
		
	
	}
}
