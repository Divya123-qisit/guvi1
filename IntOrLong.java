import java.util.*;
import java.lang.*;
import java.io.*;
class IntOrLong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=-2147483648 && n<=2147483647)
		System.out.println("INT");
		else
		System.out.println("LONG");
	}
}
