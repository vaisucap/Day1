package testnew;

import java.util.Scanner;

public class Q1avg {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
	int sum = 1; int avg = 0;
	for (int i=1; i<=10; i++ ) { 
	    System.out.println("Enter number "); 
	    sum = sum + sc.nextInt(); 
	    avg = sum/10; 
	}
	System.out.println("sum is "+ sum); 
	System.out.println("Avg is : "+ avg);
}
}
