import java.util.*;
import java.lang.*;
import java.io.*;
class CountSp
{
	public static void main (String[] args) 
	{
		int ch=0;
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(!(Character.isAlphabetic(str.charAt(i))) && !(Character.isDigit(str.charAt(i))))
			
				ch++;
			
		}
		System.out.println(ch);
	}
}
