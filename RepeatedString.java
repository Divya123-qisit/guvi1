import java.util.*;
import java.lang.*;
import java.io.*;
class RepeatedString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		char c=' ';
		int count=0;
		String str1=sc.nextLine();
    char[] ch=str1.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
      int temp=0;
      for(int j=0;j<ch.length;j++)
      {
        if(ch[i]==ch[j])
           temp++;
      }
      if(count<temp)
      {
          count=temp;
          c=ch[i];
      }
    }
    System.out.println(c);
	}
}
