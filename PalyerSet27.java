import java.util.*;
import java.lang.*;
import java.io.*;
class Palyer27
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
	String s=in.next();
	char c[]=s.toCharArray();
	String res="";
	for(int i=0;i<s.length();i++){
	if(c[i]>='a' && c[i]<='z'){
		res=res+Character.toString(c[i]).toUpperCase();
	}
	else if(c[i]>='A' && c[i]<='Z'){
		res=res+Character.toString(c[i]).toLowerCase();
	}
	}
	System.out.println(res);
	}
}
