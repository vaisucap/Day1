package testnew;

import java.util.Scanner;

public class Pyramid {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		for (int i=1;i<=n;i++){
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			for (int k=1;k<=i;k++) {
				System.out.print(i+"* ");
			}
		   System.out.println(); 
		}
	}
}

