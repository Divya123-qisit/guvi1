import java.util.*;
import java.lang.*;
import java.io.*;
class Palindrom
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String r="";
		for(int i=s.length()-1;i>=0;--i)
		{
			r=r+s.charAt(i);
		}
		if(r.equals(s))
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
