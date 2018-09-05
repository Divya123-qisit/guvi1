import java.util.*;
import java.lang.*;
import java.io.*;
class FactorsEven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=1;i<=k;i++)
		{
		if(k%i==0)
		{
		if(i%2==0)
		{
			if(i!=k)
				System.out.print(i+" ");
			else
				System.out.println(i);
		}
		}
		}
			
	
	}
}
