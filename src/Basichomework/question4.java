package Basichomework;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the principal");
        double P = input.nextDouble();
        System.out.println("Please enter the time in years");
        double T = input.nextDouble();
        System.out.println("Please enter the rate in percentage");
        double R = input.nextDouble();
        double SI = P*T*R/100;
        System.out.println("Simple Interest is    " + SI);

    }
}
