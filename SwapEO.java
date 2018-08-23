import java.util.*;
import java.lang.*;
import java.io.*;
class SwapEO
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
                        String even="";
                        String odd="";
                        String res="";
                        for(int i=0;i<str.length();i++)
                        {
                        	if(i%2==0)
                        	even+=str.charAt(i);
                        	else
                        	odd+=str.charAt(i);
                        }
                        for(int i=0;i<even.length();i++)
                        {
                          
                          res+=odd.charAt(i);
                           res+=even.charAt(i);
                        }
                        System.out.println(res);
	}
}
