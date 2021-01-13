package homework;

import java.util.Scanner;

public class question29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n terms");
        int j = 1;
        int k = 1;
        int n = input.nextInt();
        char fac = '!';

        for (int i = 1; i <= n; ++i) {
            k = i;
            System.out.print(j + " +");
            j = j |(k + '!');


        }


    }

}

