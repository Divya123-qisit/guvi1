import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Alpha
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		System.out.println("Vowel");
		}
		else if((ch>'a'||ch<='z')&&(ch>'A'||ch<='Z'))
		{
			System.out.println("Consonant");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}
}
