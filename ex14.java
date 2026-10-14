package demo;
import java.util.*;
public class ex14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of row array:");
		int n=sc.nextInt();
		System.out.println("size of column array:");
		int m=sc.nextInt();
		System.out.println("enter elements:");
		int [][]arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		}
		}                                                                                                                 
