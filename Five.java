import java.util.*;
import java.lang.*;
import java.io.*;
class Five
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			int result=n*i;
			System.out.println(result);
		}
	}
}
