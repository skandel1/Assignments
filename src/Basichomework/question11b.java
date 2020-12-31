package Basichomework;
import java.util.Scanner;
public class question11b {
    static float area(float a, float b, float c ) {
        float s = (a + b + c)/2;
        return (float) Math.sqrt((s*(s-a)*(s-b)*(s-c)));

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of a");
        float x = input.nextFloat();
        System.out.println("enter the value of b");
        float y = input.nextFloat();
        System.out.println("enter the value of c");
        float z = input.nextFloat();
        System.out.println("the value of area  " + area(x,y,z));
    }
}
