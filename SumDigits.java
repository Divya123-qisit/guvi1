import java.util.*;
import java.lang.*;
import java.io.*;
class SumDigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int s=0,r;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			s=s+r;
		}
		System.out.println(s);
	}
}
