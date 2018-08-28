import java.util.*;
import java.lang.*;
import java.io.*;
class ReplaceSpaces
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.replaceAll("\\s", "");
		System.out.println(str);
	}
}
