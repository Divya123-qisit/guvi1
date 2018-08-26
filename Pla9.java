/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Pla9
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int f=0;
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		for(int j=a;j<=b;j++)
		{
			f=0;
		for(int i=2;i<j;i++)
		{
			if(j%i==0)
			{
				f=1;
				break;	
			}
			
		}
			if(f==0)
			{
				c++;
			}
		}
		
		System.out.println(c);
		
	}
}
