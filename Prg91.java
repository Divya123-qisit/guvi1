import java.util.*;
import java.lang.*;
import java.io.*;
class Prg91
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		int s=2*((l*b)+(b*h)+(h*l));
		int v=l*b*h;
		System.out.print(s+" "+v);
	}
}
