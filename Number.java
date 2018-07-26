import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  number");
		n=sc.nextInt();
		if(n==0)
		{
			System.out.println("either postive or negative");
		}
	else if(n>0)
	{
		System.out.println("postive number");
	}
	else if(n<0)
	{
	System.out.println("negative number");	
	}
}


}
