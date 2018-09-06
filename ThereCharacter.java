import java.util.*;
import java.lang.*;
import java.io.*;
class ThereCharacter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i=i+3)
		{
			System.out.print(str.charAt(i));
			
		}
		
	}
}
