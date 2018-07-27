import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Leaf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int year;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					flag=true;
				}
				else
				flag=false;
			}
			else
			flag=true;
		}
		else 
		flag=false;
		if(flag==true)
		{
		System.out.println("yes");
		}
		else
		{
		System.out.println("no");
		}
			
		
	}
		
		
		
			
}
