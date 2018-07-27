import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Postvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		n=sc.nextInt();
		 if(n>0)
		{
			System.out.println("Postive");
		}
		else if(n<0)
		{
			System.out.println("Negative");
		}
		else
			System.out.println("Zero");
		

	}
}
