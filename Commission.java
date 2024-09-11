package controlflowchallenge;

import java.util.Scanner;

import static java.lang.System.exit;

public class Commission {
    public static void main(String[] args) {
        int sales;
        double commission = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sales figure: ");
        sales = scanner.nextInt();
        if (sales<1000) {
            System.out.println("You did not earn any commission");
            exit(0);
        }
        else if (sales<5000) commission = sales*0.1;
        else if (sales<10000) commission = sales*0.2;
        else commission = sales*0.3;
        System.out.println("Your commission is $" + commission);
    }
}
