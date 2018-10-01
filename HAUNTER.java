/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HAUNTER
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            c[i]=0;
        }
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {   
               if(arr[i]==arr[j])
               {
                  c[i]=c[i]+1;
               }
           }
        }
        for(int i=0;i<c.length;i++)
        {
        	if(i!=n-1)
            if(c[i]<2)
            System.out.print(arr[i]+" ");
            else
            System.out.print(arr[i]);
        }
	}
}
