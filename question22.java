package homework;

import java.util.Scanner;

public class question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        int num = input.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(num+"*"+i+"="+num*i);

        }

    }
}
