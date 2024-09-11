package controlflowchallenge;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        int age=0; int numtickets; int NORMALTICKET = 7;
        double finalprice=NORMALTICKET;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age<5) finalprice = 0.6*NORMALTICKET;
        else if (age < 60){
            System.out.print("How many tickets? ");
            numtickets = scanner.nextInt();
            if (numtickets>=2) finalprice = 0.3*NORMALTICKET;
        }
        else finalprice = 0.55*NORMALTICKET;
        System.out.println("Your price per ticket is "+finalprice+"euros");
    }
}
