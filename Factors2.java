import java.util.*;
import java.lang.*;
import java.io.*;
class Factors2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}
}
