import java.util.*;
import java.lang.*;
import java.io.*;
class IndexOf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int pos=0,i;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c=sc.next().charAt(0);
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
			pos=i;
			break;
			}
		}
		System.out.println(i+1);
	}
}
