import java.util.*;
import java.lang.*;
import java.io.*;
class NumberOnce
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
			{
				if(i!=j&&arr[i]==arr[j])
					c++;
			}
			if(c==0)
			{
				System.out.println(arr[i]);
				break;
			}
			
		}
		s.close();
	}
}
