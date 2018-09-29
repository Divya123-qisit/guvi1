import java.util.*;
import java.lang.*;
import java.io.*;
class OctalNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		String a;
		a=in.next();
		int b=Integer.parseInt(a,2);
		System.out.println(Integer.toOctalString(b));
	}
}
