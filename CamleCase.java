import java.util.*;
import java.lang.*;
import java.io.*;
class CamleCase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String s1="";
		String strArr[]=str.split(" ");
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].length()>=0)
			{
				if(Character.isUpperCase(strArr[i].charAt(0)))
				{
					s1+=Character.toLowerCase(strArr[i].charAt(0))+""+strArr[i].substring(1)+" ";
				}
				else
                   s1+=Character.toUpperCase(strArr[i].charAt(0))+""+strArr[i].substring(1)+" ";
			}
		}
		System.out.println(s1.substring(0,s1.length()-1));
	}
}
