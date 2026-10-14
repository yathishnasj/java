package demo;
import java.util.*;
public class ex11 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("no of elements:");
int n=sc.nextInt();
System.out.println("enter elements:");
int arr[]=new int[n];
for(int i=0;i<n;i++) {
arr[i]=sc.nextInt();
	}
System.out.print("Array : ");
for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}
	}
}
                                                                                                         
