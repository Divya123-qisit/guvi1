import java.util.*;
import java.lang.*;
import java.io.*;
class CaseIng
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		if(str.equalsIgnoreCase(str1))
		System.out.println("yes");
		else
		System.out.println("no");
		
	
	}
}
