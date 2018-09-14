import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int count=1;
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
					count++;
			}
			if(count>1)
				if(count==k){
					System.out.print(a[i]);
			break;
				}
		}
				
		
	}
}
