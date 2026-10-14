package demo;
import java.util.*;
public class ex1 {
void rec(int n) {
	/*if(n==10) {
		return;
	}
	System.out.println(n);
	rec(n+1);*/
	if(n==0) {
		return;
	}
	System.out.println(n);
	rec(n-1);
	System.out.println(n);
}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
ex1 m=new ex1();
m.rec(n);
	}

}
