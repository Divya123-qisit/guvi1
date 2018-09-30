/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PASER
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int freq[]=new int[n];
		int count=0;
		for(int i=0; i<n; i++)
		{
		    arr[i]=sc.nextInt();
		    freq[i] = -1;
		}


		for(int i=0; i<n; i++)
		{
		    count = 1;
		    for(int j=i+1; j<n; j++)
		    {
		        if(arr[i]==arr[j])
		        {
		            count++;
		            freq[j] = 0;
		        }
		    }
		    if(freq[i] != 0)
		    {
		        freq[i] = count;
		    }
		}
		for(int i=0;i<n;i++)
		{
		if(freq[i]==1)
		System.out.println(arr[i]);
		}
	}
}
