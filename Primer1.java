import java.util.*;
import java.lang.*;
import java.io.*;
class Primer1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a+1;i<b;i++)
		{
			int counter=0;
			for(int num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2)
			{
				System.out.println(i);
			}
		}
	}
}
		
