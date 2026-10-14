package demo;
class Bank{
	int deposit;
	int balance;
	int withdrawl;
	Bank(int d,int w,int b){
		deposit=d;
		withdrawl=w;
		balance=b;
		System.out.println("Deposit="+deposit);
		System.out.println("Withdrawl="+withdrawl);
		System.out.println("Balance="+balance);
	}
}
public class ex9 {

	public static void main(String[] args) {
		Bank b1=new Bank(1000,2000,3000);
		Bank b2=new Bank(300,500,750);

	}

}
