import java.util.*;
import java.lang.*;
import java.io.*;
class Player36
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes
		int count=0,r;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
		
		if(r==k)
		count++;
		n=n/10;
		}
		System.out.println(count);
		
	}
}
