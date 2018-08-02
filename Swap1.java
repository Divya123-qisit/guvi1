import java.util.*;
import java.lang.*;
import java.io.*;
class Swap1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println(m);
		System.out.println(n);
	}
}
