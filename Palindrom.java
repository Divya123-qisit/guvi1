import java.util.*;
import java.lang.*;
import java.io.*;
class Palindrom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0,r;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
