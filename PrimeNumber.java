import java.util.*;
import java.lang.*;
import java.io.*;
class PrimeNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i=2;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n%i==0)
		{
			flag=true;
			break;
		}
		if(!flag)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	
	}
}
