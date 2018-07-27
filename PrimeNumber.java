import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,i;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
			if(!flag)
			System.out.println("yes");
			else
			System.out.println("no");
			
		
	}
}
