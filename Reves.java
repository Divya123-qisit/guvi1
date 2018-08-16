import java.util.*;
import java.lang.*;
import java.io.*;
class Reves
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int res=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			int r=n%10;
			res=res*10+r;
			n=n/10;
		}
		System.out.println(res);
	}
}
