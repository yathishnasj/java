package demo;
import java.util.*;
class Mobile{
	Scanner sc=new Scanner(System.in);
	String brand;
	int price;
	int ram;
	void brand() {
		System.out.println("Enter brand:");
	    brand=sc.nextLine();
	}
	void price() {
		System.out.println("Enter price:");
		price=sc.nextInt();
	}
	void ram() {
		System.out.println("Enter ram:");
		ram=sc.nextInt();
	}
	void disp() {
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("ram:"+ram+" GB");
	}
	static void high(Mobile m1,Mobile m2) {
		if(m1.price>m2.price) {
			System.out.println(m1.brand +" has highest price");
		}
		else {
			System.out.println(m2.brand +" has highest price");
		}
	}
}
public class ex6 {

	public static void main(String[] args) {
Mobile m1=new Mobile();
Mobile m2=new Mobile();
System.out.println("Mobile 1");
m1.brand();
m1.price();
m1.ram();
System.out.println("Mobile 2");
m2.brand();
m2.price();
m2.ram();
System.out.println();
System.out.println("Mobile 1");
m1.disp();
System.out.println();
System.out.println("Mobile 2");
m2.disp();
System.out.println();
Mobile.high(m1,m2);
	}
	

}

