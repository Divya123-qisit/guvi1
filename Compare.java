import java.util.*;
import java.lang.*;
import java.io.*;
class Compare
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int result=str.compareTo(str1);
		if(result==0)
		System.out.println(str);
		else if(result<0)
		System.out.println(str1);
		else
		System.out.println(str);
	}
}
