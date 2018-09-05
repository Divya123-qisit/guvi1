import java.util.*;
import java.lang.*;
import java.io.*;
class SquareBetweenTwoNumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int count=0;
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			int num=i;
			int sq=(int)Math.sqrt(num);
			if(sq*sq==num)
			count++;
		}
		System.out.println(count);
		
	}
}
