package Basichomework;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of circle");
        double r = input.nextDouble();
        double area = 3.14 * r * r;
        System.out.println("The area of circle is  " + area);
        System.out.println("Please enter the length of rectangle");
        double l = input.nextDouble();
        System.out.println("Please enter the breadth of rectangle");
        double b = input.nextDouble();
        double areaofrect = l * b;
        System.out.println("The area of rectangle is  " + areaofrect);
        System.out.println("please enter breadth of triangle ");
        double breadth = input.nextDouble();
        System.out.println("Please enter height of triangle");
        double height = input.nextDouble();
        double areaoftri = 0.5 * breadth * height;
        System.out.println("the area of triangle is  " + areaoftri);


    }
}
