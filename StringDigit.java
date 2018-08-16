import java.util.*;
import java.lang.*;
import java.io.*;
class StringDigit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			System.out.print(s.charAt(i));
		}
	}
}
