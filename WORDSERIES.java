import java.util.*;
import java.lang.*;
import java.io.*;
class WORDSERIES
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.next();
		String a[]=str.split(" ");
		int count=0;
		for(int i=1;i<a.length;i++)
		{
			if(str1.equals(a[i]))
			{
			count=i;
			break;
			}
		}
		System.out.println(count);
	}
}
