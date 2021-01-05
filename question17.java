package homework;

import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
            System.out.println("it is leap year");
        }
        else {
            System.out.println("it is not leap year");
        }

    }
}
