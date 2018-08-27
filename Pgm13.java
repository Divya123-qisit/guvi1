import java.util.*;
import java.lang.*;
import java.io.*;
class Pgm13
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		int r;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		while(n!=0)
		{
			
			 r=n%10;
			 s=s+r*r;
			 n=n/10;
		}
		System.out.println(s);
	}
}
