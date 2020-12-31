package Basichomework;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double number1 = input.nextDouble();
        System.out.println("Enter second number");
        double number2 = input.nextDouble();
        double sum = number1 + number2;
        double avg = sum/2;
        System.out.println("The sum of numbers is   "+ sum );
        System.out.println("The average of two number is  " + avg);
    }
}
