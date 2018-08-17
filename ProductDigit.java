import java.util.*;
import java.lang.*;
import java.io.*;
class ProductDigit
{
	public static void main (String[] args) 
	{
		int s=1,r;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			r=n%10;
			s=s*r;
			n=n/10;
		}
		System.out.println(s);
	}
}
