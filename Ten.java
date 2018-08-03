import java.util.*;
import java.lang.*;
import java.io.*;
class Ten
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[50];
		int max=0;
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=10;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
