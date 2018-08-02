import java.util.*;
import java.lang.*;
import java.io.*;
class Numberic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		 int len=str.length();
		for(int i=0;i<len;i++)
		{
			if (Character.isDigit(str.charAt(i)))
			{
			count++;
			}
		}
		System.out.println(count);
		
	}
}
