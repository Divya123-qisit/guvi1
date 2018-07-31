import java.util.*;
import java.lang.*;
import java.io.*;
class Time
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int hours=t/60;
		int minute=t%60;
		System.out.println(hours+" "+minute);
	}
}
