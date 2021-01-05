package homework;

import java.util.Scanner;

public class question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the nth number");
        int num = input.nextInt();
        int sum = (num*(num+1))/2;
        System.out.println("the sum of first " +num+ "  natural number is  "+ sum);
    }
}
