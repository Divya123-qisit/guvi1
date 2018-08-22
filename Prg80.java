import java.util.*;
import java.lang.*;
import java.io.*;
class Prg80
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,i=0;
		int arr[]=new int[20];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			int r=n%10;
			if(r%2!=0)
			{
				arr[i++]=r;
			}
			n=n/10;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(" "+arr[j]);
		}
	}
}
