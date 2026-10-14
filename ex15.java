package demo;

import java.util.*;

public class ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size of row array:");
		int n = sc.nextInt();
		System.out.println("size of column array:");
		int m = sc.nextInt();
		System.out.println("size of height array:");
		int h = sc.nextInt();
		int[][][] arr = new int[n][m][h];
		System.out.println("enter elements:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < h; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("Array:");
		for (int i = 0; i < n; i++) {
			System.out.println("layer "+(i+1));
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < h; k++) {
					System.out.print(arr[i][j][k] + " ");
				}System.out.println();
			}
			System.out.println();
		}
	}
}
