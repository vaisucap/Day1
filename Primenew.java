package testnew;

import java.util.Scanner;

public class Primenew {
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);

	    int n = scan.nextInt();
	    int x = 2;

	    for(int i = 0; i <= n; i++)
	    {
	        int count = 0;

	        for(int j = 1; j <= x; j++)
	            if(x%j == 0)
	                count++;

	        if(count == 2)
	            System.out.print(x + " ");

	        x++;
	    }
	}

}
