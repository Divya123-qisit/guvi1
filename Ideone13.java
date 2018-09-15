import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone13
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int max=0,temp;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				temp=a[i]-a[j];
				if(temp>max)
					max=temp;
				else
					max=max;
			}
		}
		System.out.print(max);

	}
}
