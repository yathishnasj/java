package demo;
import java.util.*;
class shop {
    int chocolate = 50;
    int butterscotch = 60;
    int vannila = 30;
    int strawberry = 40;
    int total = 0;

    void chocolate(int a) {
        System.out.println("You ordered chocolate IceCream");
        total += a * chocolate;
    }
    void butterscotch(int a) {
        System.out.println("You ordered butterscotch IceCream");
        total += a * butterscotch;
    }
    void vannila(int a) {
        System.out.println("You ordered vannila IceCream");
        total += a * vannila;
    }
    void strawberry(int a) {
        System.out.println("You ordered strawberry IceCream");
        total += a * strawberry;
    }
    void total() {
        System.out.println("Your total bill = " + total);
    }
}
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shop s = new shop();
        int n;
            System.out.println("\nMenu");
            System.out.println("1. Chocolate - Rs.50");
            System.out.println("2. Butterscotch - Rs.60");
            System.out.println("3. Vanilla - Rs.30");
            System.out.println("4. Strawberry - Rs.40");
            System.out.println("5. Get Total Bill");
            do {
            System.out.println("Enter your choice:");
            n = sc.nextInt();
            switch (n) {
                case 1:{
                    System.out.println("Enter quantity:");
                    int a = sc.nextInt();
                    s.chocolate(a);
                    break;
                }
                case 2:{
                    System.out.println("Enter quantity:");
                    int b = sc.nextInt();
                    s.butterscotch(b);
                    break;
                }
                case 3:{
                    System.out.println("Enter quantity:");
                    int c = sc.nextInt();
                    s.vannila(c);
                    break;
                }
                case 4:{
                    System.out.println("Enter quantity:");
                    int d = sc.nextInt();
                    s.strawberry(d);
                    break;
                }
                case 5:{
                    System.out.println("Get Bill!");
                    s.total();
                    break;
                }
                default:{
                    System.out.println("Invalid choice");
                }
            }
            
        } while (n != 5);
        sc.close();
    }
}
