import java.util.*;
import java.lang.*;
import java.io.*;
class Permution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n,k,diff=0,i,nfact=1,difffact=1,res=0;
		n=in.nextInt();
		k=in.nextInt();
		diff=n-k;
		for(i=1;i<=n;i++)
		{
			nfact=nfact*i;
			
		}
		for(i=1;i<=diff;i++)
		{
			difffact=difffact*i;
			
		}
		res=nfact/difffact;
		System.out.print(res);
	}
}
