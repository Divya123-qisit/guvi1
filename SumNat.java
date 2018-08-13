import java.util.*;
import java.lang.*;
import java.io.*;
class SumNat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
