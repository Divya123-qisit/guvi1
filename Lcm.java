import java.util.*;
import java.lang.*;
import java.io.*;
class Lcm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int lcm=0;
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<n1*n2;i++)
		{
			if(i%n1==0 && i%n2==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println(lcm);
	}
}
