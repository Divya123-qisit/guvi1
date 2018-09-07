import java.util.*;
import java.lang.*;
import java.io.*;
class SRELEN
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		int count=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)
		if(c[i]!=' ')
		count++;
		System.out.println(count);
		
	
	}
}
