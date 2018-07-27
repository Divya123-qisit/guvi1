import java.util.*;
import java.lang.*;
import java.io.*;
class Count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,count=0,i=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			n=n/10;
			count++;

	
		}
		System.out.println(count);
	}
}
