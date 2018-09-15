import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone7
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int temp=0,min=0,m;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			min=a[0];
		}
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					m=a[i]-a[j];
					if(m>0)
					if(m<min)
					{
						min=m;
					}
				}
			}
			System.out.println(min);
	}
}
