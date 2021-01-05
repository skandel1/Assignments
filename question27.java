package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class question27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        int sum = 0;

        while (number >0){
            sum +=number%10;
            number = number/10;





        }

        System.out.println(sum);



    }

}
