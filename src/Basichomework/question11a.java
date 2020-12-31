package Basichomework;

import java.util.Scanner;

public class question11a {

    String name = "";

    static float s(float u, float a, float t){
        return (float) ( u*t + 0.5*a*t*t);
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of u  " );
        float x = input.nextFloat();
        System.out.println("Please enter the value of a");
        float y = input.nextFloat();
        System.out.println("enter the value of t");
        float z = input.nextFloat();
        System.out.println("Value of s: " + s(x,y,z));






    }
}
