import java.util.*;
import java.lang.*;
import java.io.*;
class CountLine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int ch=1;
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)=='.')&&(str.charAt(i+1)!='.'))
			{
				ch++;
			}
		}
		System.out.println(ch);
	}
}
