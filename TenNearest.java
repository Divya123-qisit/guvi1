import java.util.*;
import java.lang.*;
import java.io.*;
class TenNearest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%10==0)
		{
			System.out.println(a);
		}
		else
		a=(a/10)*10;
		b=a+10;
		System.out.println(b);
	}
}
