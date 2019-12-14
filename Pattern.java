package lab;
import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");

        int n = scanner.nextInt();
        System.out.println(" Printing the pattern... ");
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
	}
	}

}
