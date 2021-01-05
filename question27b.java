package homework;

import java.util.Scanner;

public class question27b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = input.nextInt();
        int product = 1;
        while(num>0 ){
             product =product*(num%10);
             num = num/10;

        }
        System.out.println(product);

    }

}
