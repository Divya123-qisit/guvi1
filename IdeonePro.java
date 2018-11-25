import java.util.*;
import java.lang.*;
import java.io.*;
class IdeonePro
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int[] a=new int[n];
  for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
  for(int i=0;i<a.length-1;i++)
    for(int j=0;j<a.length;j++)
       if(a[i]+a[j]==k){
          System.out.println("yes");
         System.exit(0);
          }
 System.out.println("no");
	}
}
