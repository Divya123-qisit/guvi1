import java.util.*;
import java.lang.*;
import java.io.*;
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,power,result=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		power=sc.nextInt();
		while(power!=0)
		{
		result=result*n;
		power=power-1;
		}
		System.out.println(result);
	}
}
