package homework;

import java.util.Scanner;

public class question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = input.nextInt();
        System.out.println("Enter second number");
        int y = input.nextInt();
        System.out.println("Enter a operator");
        char operator = input.next().charAt(0);
        double add = x + y;
        double sub = x - y;
        double mul = x * y;
        double div = x / y;
        switch (operator) {
            case '+': {
                System.out.println(add);
                break;
            }
            case '-': {
                System.out.println(sub);
                break;

            }
            case '*': {
                System.out.println(mul);
                break;
            }
            case '/': {
                System.out.println(div);
                break;

            }


        }

    }
}
