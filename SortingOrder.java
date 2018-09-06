import java.util.*;
import java.lang.*;
import java.io.*;
class SortingOrder
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int flag=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==1)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
