package Basichomework;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of circle");
        float r = input.nextFloat();
        float perimeteroftriangle = (float) (2 * 3.14 * r);
        System.out.println("The perimeter of cirle is   " + perimeteroftriangle);
        System.out.println("Enter length of rectangle  ");
        float l = input.nextFloat();
        System.out.println("Enter breadth of rectangle");
        float b = input.nextFloat();
        float perimeter = 2*l + 2*b;
        System.out.println("The perimeter of rectangle is " + perimeter);

    }
}
