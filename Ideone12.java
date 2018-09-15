import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone12
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,count1=0,count2=0,count3=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
			count++;
			count2=a[i];
			}
			else
			if(a[i]%2!=0)
			{
                                                count1++;
				count3=a[i];
			}
		}
		if(count==1)
		System.out.println(count2);
		if(count1==1)
		System.out.println(count3);
	}	
	
}
