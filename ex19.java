package demo;

import java.util.*;

public class ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;
		int value = 1;
		int arr[][] = new int[n][n];
		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				arr[top][i] = value++;
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				arr[i][right] = value++;
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					arr[bottom][i] = value++;
				}
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					arr[i][left] = value++;
				}
				left++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
