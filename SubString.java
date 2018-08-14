import java.util.*;
import java.lang.*;
import java.io.*;
class SubString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		System.out.println(str.substring(0,n));
	}
}
