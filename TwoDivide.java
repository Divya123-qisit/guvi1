import java.util.*;
import java.lang.*;
import java.io.*;
class TwoDivide
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		if(n1%2==0)
		{
			System.out.println(n1/2);
		}
		else
		{
			System.out.println(n1);
		}
	}
}
