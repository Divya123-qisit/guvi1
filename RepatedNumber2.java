import java.util.*;
import java.lang.*;
import java.io.*;
class RepatedNumber2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int len,count=0;
		String str=sc.next();
		len=str.length();
		char ch[]=str.toCharArray();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
			if(Character.getNumericValue(ch[i])==Character.getNumericValue(ch[j]))
			count++;
			}
		}
		if(count>0)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
