import java.util.*;
import java.lang.*;
import java.io.*;
class ProdutEven
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int result;
		result=n*n1;
		if(result%2==0)
		{
			System.out.println("even");
		}
		else 
		System.out.println("odd");
	}
}
