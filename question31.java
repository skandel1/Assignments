package homework;

import java.util.Scanner;

public class question31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n numbers");
        int n = input.nextInt();
        int i, j;
        for( i = 1; i<=n;i++) {
            for( j= 1; j<= i; j++) {
                System.out.print(" " + j);

            }
            System.out.println("");
        }

    }
}
