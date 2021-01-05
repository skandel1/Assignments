package homework;

import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int x = input.nextInt();
        System.out.println("enter second number");
        int y = input.nextInt();
        System.out.println("enter third number");
        int z = input.nextInt();

        int maxnum;
        if(y>x&y>z) {
            maxnum = y;
        }
        else if(z>x&z>y){
            maxnum = z;
        }
        else maxnum = x;
        System.out.println("The largest number is  "+  maxnum);
    }
}
