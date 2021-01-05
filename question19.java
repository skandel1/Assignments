package homework;

import java.util.Scanner;

public class question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the length of first side");
        int a = (int) input.nextFloat();
        System.out.println("please enter the length of second side");
        int b = (int) input.nextFloat();
        System.out.println("please enter the length of third side");
        int c = (int) input.nextFloat();
        if(a!=b&&b!=c&&a!=c) {
            System.out.println("it is scalane triangle");
        }
        else if((a==b&&b!=c)||(b==c&&c!=a)||(a==c&&c!=b) ){
            System.out.println("it is isocelos triangle");

        }
        else System.out.println("it is equilateral triangle");
    }
}
