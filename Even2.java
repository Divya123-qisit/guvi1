import java.util.*;
import java.lang.*;
import java.io.*;
class Even2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0||--n%2==0)
		System.out.println(n);
	}
}
