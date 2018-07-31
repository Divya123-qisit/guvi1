import java.util.*;
import java.lang.*;
import java.io.*;
class Are
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		System.out.println((n*(2*a+(n-1)*d))/2);
	}
}
