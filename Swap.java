import java.util.*;
import java.lang.*;
import java.io.*;
class Swap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,temp;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println(n1);
		System.out.println(n2);
	}
}
