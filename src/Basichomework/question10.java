package Basichomework;
import java.util.Scanner;
public class question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of pounds");
        float pounds = input.nextFloat();
        float kilogram = (float) (0.454 * pounds);
        System.out.println(kilogram);
    }
}
