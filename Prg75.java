import java.util.*;
import java.lang.*;
import java.io.*;
class Prg75
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		a=str.length()/2;
		char[] array=str.toCharArray();
		if(str.length()%2==0)
		{
			array[a-1]='*';
			array[a]='*';
			System.out.println(array);
		}
		else
		array[a]='*';
		System.out.println(array);
	}
}
