import java.util.*;
import java.lang.*;
import java.io.*;
class SubStringPl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		boolean isFound=str.indexOf(str1)!=-1?true:false;
		if(isFound)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
