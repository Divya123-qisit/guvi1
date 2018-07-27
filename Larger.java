import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Larger
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((a>b)&&(b>c))
		{
			System.out.println(a);
		}
		else if((b>a)&&(b>c))
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	
		
	}
}
