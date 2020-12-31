package Basichomework;
import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of cylinder");
        float r = input.nextFloat();
        System.out.println("Please enter the height of cylinder");
        float h = input.nextFloat();
        float volume = (float) (2 * 3.14 * r * r * h);
        System.out.println("The volume of cylinder is  " + volume);
    }
}
