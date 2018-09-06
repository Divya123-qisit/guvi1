import java.util.*;
import java.lang.*;
import java.io.*;
class Paranthis
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int count=0,count1=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				count++;
			}
			else if(str.charAt(i)==')')
			{
				count1++;
			}
		}
		if(count==count1)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
