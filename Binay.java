import java.util.*;
import java.lang.*;
import java.io.*;
class Binay
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(String.valueOf(str).matches("[0-1]+"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
