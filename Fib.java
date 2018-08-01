import java.util.*;
import java.lang.*;
import java.io.*;
class Fib
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int c;
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(b);
		for(int i=1;i<n;i++)
		{
			 c=a+b;
			 System.out.println(c);
			a=b;
			b=c;
		}
		
		
		
	}
}
