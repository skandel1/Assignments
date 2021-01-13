package homework;

import java.util.Scanner;

public class question30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t1 = 0;
        int t2 = 1;
        System.out.println("enter n  terms");
        int n = input.nextInt();
        for (int i = 0; i<=n;++i ) {
            System.out.print(t1 + " " );
            int sum = t1+t2;
            t1 = t2;
            t2 = sum;


        }

    }
}
