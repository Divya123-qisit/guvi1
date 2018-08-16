import java.util.*;
import java.lang.*;
import java.io.*;
class Lexo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char str1[]=str.toCharArray();
		Arrays.sort(str1);
		System.out.println(str1);
	}
}
