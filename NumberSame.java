import java.util.*;
import java.lang.*;
import java.io.*;
class NumberSame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<Integer>stack=new LinkedList<Integer>();
		while(n>0)
		{
			stack.push(n%10);
			n=n/10;
		}
		while(!stack.isEmpty())
		System.out.printf(stack.pop()+" ");
		System.out.printf(" ");
		
	}
}
