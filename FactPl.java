import java.util.*;
import java.lang.*;
import java.io.*;
class FactPl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,fact=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
