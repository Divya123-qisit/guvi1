import java.util.*;
import java.lang.*;
import java.io.*;
class Even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1+1;i<n2;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
