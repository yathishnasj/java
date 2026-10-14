package demo;

import java.util.Scanner;

class ATM{
	int accountHolder;
	int pin;
	int balance;
	ATM(int acc,int p,int b){
		accountHolder=acc;
		pin=p;
		balance=b;
	}
	void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Deposited amount="+amount);
	}
	 void withdrawl(int enteredPin,int amount) {
		 if(pin==enteredPin) {
			 System.out.println("withdrawl amount="+amount);
		if(amount<=balance) {
		balance=balance-amount;
		System.out.println("withdrawl Successful");
		}
		else {
			System.out.println("Insufficient balance");
		}
		 }
		 else {
			 System.out.println("Invalid pin");
		 }
	}
	 void displayBalance(int enteredPin) {
		 if(pin==enteredPin) {
			System.out.println("balance="+balance);
		}
		 else {
			 System.out.println("Invalid pin");
		 }
	 }
}
	public class ex8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM(120,2112,5000);
		ATM a2=new ATM(145,1234,2000);
		System.out.println("Account 1:");
		a1.deposit(500);
		a1.displayBalance(2112);
		a1.withdrawl(2112,300);
		a1.displayBalance(2112);
		System.out.println("\nAccount 2:");
		a2.deposit(1000);
		a2.displayBalance(1234);
		a2.withdrawl(1234,4000);
		a2.displayBalance(1234);
		
	}
} 

	