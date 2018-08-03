import java.util.*;
import java.lang.*;
import java.io.*;
class CountCh
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int ch=0;
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				ch++;
			}
		}
		System.out.println(ch);
	}
}
