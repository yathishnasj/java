package demo;

import java.util.*;

public class ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no of elements:");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter key:");
		int key = sc.nextInt();
		int found = -1;
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				found = i;
				break;
			}
		}
		if (found != -1) {
			System.out.println("Element found at index : " + found);
		} else {
			System.out.println("Element is not found !");
		}

	}

}
