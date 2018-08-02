import java.util.*;
import java.lang.*;
import java.io.*;
class Space
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,spaceCount=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		while(i<str.length())
		{
			if(str.charAt(i)==' ')
			{
				spaceCount++;
			}
			i++;
		}
		System.out.println(spaceCount);
		
	}
}
