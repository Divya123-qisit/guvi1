import java.util.*;
import java.lang.*;
import java.io.*;
class CharRe
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		int count=0;
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		char ch=sc.next().charAt(0);
		for(int i=0;i<s1.length();i++)
		if(s1.charAt(i)==ch)
		{
			count++;
		}
		System.out.println(count);

	}
}
