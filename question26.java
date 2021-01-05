package homework;

import java.util.Scanner;

public class question26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();
        int revnum = 0;
        while (num!=0){
            revnum = revnum*10;
            revnum = revnum + num%10;
            num = num/10;
        }
        System.out.println("the reverse number is  " +revnum);
    }
}
