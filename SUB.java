import java.util.*;
import java.lang.*;
import java.io.*;
class SUB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.next();
		int n=s1.length();
		int count=0;
		for(int i=0;i<s.length()-n;i++)
		{
			if((s.substring(i,i+n)).equals(s1))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
