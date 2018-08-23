import java.util.*;
import java.lang.*;
import java.io.*;
class Reverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
	    {
	      rev=rev+str.charAt(i);	
	    }
	    System.out.println(rev);
	}
}
