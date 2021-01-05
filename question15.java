package homework;

import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ascii code");

        int code = input.nextInt();
        System.out.println((char)code);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter ascii char");
        String i = input1.next();
        int ascii = Integer.parseInt(i);
        System.out.println(ascii);

    }
}
