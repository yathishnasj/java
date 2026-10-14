package demo;
import java.util.*;
class VendingMachine {
    Scanner sc = new Scanner(System.in);
    int Balance=50;
    
    String MachineName;
    void Machine() {
    	System.out.println("Balance = " + Balance);
        System.out.println("Enter product name:");
        MachineName = sc.nextLine();
    }
    void addMoney() {
        System.out.println("Add money:");
        int amount = sc.nextInt();
        Balance += amount;
    }
    void buySnacks() {
        System.out.println("Enter snack price:");
        int price = sc.nextInt();
        if (price <= Balance) {
            System.out.println("Snacks purchased successfully!");
            Balance -= price;
            System.out.println("Balance = " + Balance);
        } else {
            System.out.println("Insufficient Balance!");
            System.out.println("Balance = " + Balance);
        }
    }
}
public class ex7 {
    public static void main(String[] args) {
        VendingMachine m1 = new VendingMachine();
        VendingMachine m2 = new VendingMachine();

        System.out.println("Machine 1");
        m1.Machine();
        m1.addMoney();
        m1.buySnacks();

        System.out.println("\nMachine 2");
        m2.Machine();
        m2.addMoney();
        m2.buySnacks();
    }
}

