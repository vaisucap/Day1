package testnew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AscendingOrder {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers in array ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int temp = 0;
		System.out.println("before ascending ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		List<Integer> ul=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if(!ul.contains(a[i])) {
				ul.add(a[i]);
			}
		}
		int[] sl=new int[ul.size()];
			for (int i = 0; i < sl.length; i++) {
				sl[i]=ul.get(i);
//				if (a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
				}
			System.out.println("after ascending");
		    System.out.println(Arrays.toString(sl));
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i] + " ");
		}
	}

