package demo;
import java.util.*;
public class ex16 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int [][]arr=new int[2][];

for(int i=0;i<arr.length;i++) {
	System.out.println("size of column for row:"+(i+1));
	int m=sc.nextInt();
	 arr[i]=new int[m];
	System.out.println("enter elements:");
	for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
		}
}
System.out.println("Array:");
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
}   
}
