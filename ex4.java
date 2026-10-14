package demo;
import java.util.*;
public class ex4 {
void odd(int n) {
	if(n<1) {
		return;
	}
else if(n%2!=0) {
		System.out.println(n);
	}
	odd(n-1);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ex4 b=new ex4();
		b.odd(n);
		

	}

}
