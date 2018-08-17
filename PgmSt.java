import java.util.*;
import java.lang.*;
import java.io.*;
class Pgm101
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		int initial=str.length()-n;
		for(int i=initial;i<str.length();i++)
		System.out.print(str.charAt(i));
	}
}
