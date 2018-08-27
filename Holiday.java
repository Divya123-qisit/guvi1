import java.util.*;
import java.lang.*;
import java.io.*;
class Holiday
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	Scanner scan=new Scanner(System.in);
		String day=scan.next().toLowerCase();
		if(day.equals("saturday")||day.equals("sunday"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}
}
