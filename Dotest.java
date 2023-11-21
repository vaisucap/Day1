package testnew;

import java.util.Scanner;

public class Dotest {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any number");
		int n,temp=0;
		n=s.nextInt();
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			if (d%2==1) 
			   {
				sum=sum+(d*d);
				System.out.println(d +" square is "+sum);
				}
			else 
			{
				sum=sum+(d*d*d);
				System.out.println(d +" cube is "+sum);
		     }	
			temp=sum;
		n=n/10;
			
	}
		
		System.out.println("The sum of the given number is "+temp+".");		
}		
		
	
	
}
