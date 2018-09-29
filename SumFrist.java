import java.util.*;
import java.lang.*;
import java.io.*;
class SumFrist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;
		String str=sc.next();
		n=str.length();
char ch[]=str.toCharArray();
sum=Character.getNumericValue(ch[0])+Character.getNumericValue(ch[n-1]);
System.out.println(sum);
	}
}
