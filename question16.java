package homework;

import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        if(num % 2 == 0) {
            System.out.println("The " + num + "  is even number");
        } else System.out.println("the  " + num + "   is odd number");

    }
}
