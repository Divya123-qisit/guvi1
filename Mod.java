import java.util.*;
import java.lang.*;
import java.io.*;
class Mod
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int r=a*b%c;
		System.out.println(r);
	}
}
