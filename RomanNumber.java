import java.util.*;
import java.lang.*;
import java.io.*;
class RomanNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
	   String s=in.next();
	   String a[]={"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
	   int l=a.length;
	   for(int i=0;i<l;i++){
	   	if(a[i].equals(s))
	   	System.out.print(i+1);
	   }
	}
}
