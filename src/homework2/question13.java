package homework2;

import java.util.Scanner;
public class question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your roll number");
        int roll = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your name");
        var name = input1.nextLine();
        System.out.println("Please enter your nationality");
        var nation = input1.nextLine();
        System.out.println("My roll number is  "+ roll);
        System.out.println("My name is  "+ name);
        System.out.println("My nationality is  "+ nation);


    }
}
