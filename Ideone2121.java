import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone2121
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n,sum=0,i;
		n=in.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<0)
				sum=sum+a[i];
		}
		System.out.println(sum );
	}
}
