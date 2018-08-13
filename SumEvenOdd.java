import java.util.*;
import java.lang.*;
import java.io.*;
class SumEvenOdd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int result=0;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		result=a+b;
		if(result%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	
		
	}
}
