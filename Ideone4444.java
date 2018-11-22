import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone4444
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum1=0,sum2=0,k=1;
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			sum1=sum1+a[i];
			
		}
		b[0]=sum1;
		sum2=sum1;
		for(int i=n-2;i>=0;i--)
		{
			sum2=sum2-a[i];
			b[k]=sum2;
			k++;
			
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(b[i] + " ");
			
		}
		
	}
}
