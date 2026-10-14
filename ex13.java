package demo;
import java.util.*;
public class ex13 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("size of array:");
int n=sc.nextInt();
System.out.println("enter elements:");/*
int arr[]=new int[n];
for(int i=0;i<n;i++) {
arr[i]=sc.nextInt();
	}
System.out.print("Array : ");
for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}*/
int [][]arr=new int[n][n];
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		arr[i][j]=sc.nextInt();
	}
}
System.out.println("Array:");
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
}
}                                                                                                                 
