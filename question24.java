package homework;

import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = input.nextInt();
        int factorial =1;

        for(int i= 1; i<=num; i++){

            factorial = factorial*i;










        }
        System.out.println("the factorial of  " + num + "  is  " + factorial);




    }

}
