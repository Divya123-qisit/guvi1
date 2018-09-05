import java.util.*;
import java.lang.*;
import java.io.*;
class Player30
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int count=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int k=sc.nextInt();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str1.charAt(i))
			count++;
		}
		if(k==count)
		System.out.println("yes");
		else
		System.out.println("no");
		
		
	}
}
