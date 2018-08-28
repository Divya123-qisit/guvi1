import java.util.*;
import java.lang.*;
import java.io.*;
class Plyer24
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean numeric=true;
		try{
			Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println("yes");
        else
            System.out.println("no");
	}
}
