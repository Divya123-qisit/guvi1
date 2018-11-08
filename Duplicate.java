import java.util.*;
import java.lang.*;
import java.io.*;
class Duplicate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
int n;
n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}
Arrays.sort(arr);
for(int i=0;i<n-1;i++){
	if(arr[i]!=arr[i+1])
System.out.print(arr[i]+" ");	
}
System.out.print(arr[n-1]);
	}
}
