import java.util.*;
import java.lang.*;
import java.io.*;
class Square
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int pr=n*m;
		int sqr=(int)Math.sqrt(pr);
		if(sqr*sqr==pr)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
