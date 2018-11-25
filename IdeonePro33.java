/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class IdeonePro33
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int max=1,len=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			if (a[i] > a[i-1]) 
                len++; 
            else
            { 
            	if (max < len)     
                    max = len; 
                    len = 1;     
            }     
        } 
        if (max < len) 
            max = len; 
           System.out.println(max);
	}
}
