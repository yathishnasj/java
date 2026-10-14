package demo;
import java.util.*;
public class ex3 {
	int balance=500;
	 void checkBalance() {
		System.out.println("balance="+balance);
	}
 void deposit(int amount) {
	balance=balance+amount;
	System.out.println("Deposited amount="+amount);
}
 void withdrawl(int amount) {
	if(amount<=balance) {
	balance=balance-amount;
	System.out.println("withdrawl amount="+amount);
	}
	else {
		System.out.println("Insufficient balance");
	}
}
	public static void main(String[] args) {
		
ex3 b=new ex3();
b.checkBalance();
b.deposit(1000);
b.checkBalance();
b.withdrawl(300);
b.checkBalance();
	}

}
