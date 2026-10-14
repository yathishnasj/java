package demo;
import java.util.*;
public class ex18 {
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
		int low=0;
		int high=a.length-1;
		int found = -1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==key) {
				found=mid;
				break;
			}
			else if(key>a[mid]) {
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		if (found != -1) {
			System.out.println("Element found at index : " + found);
		} else {
			System.out.println("Element is not found !");
		}
	}

}
