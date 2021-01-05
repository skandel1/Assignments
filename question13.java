package homework;
import java.util.Scanner;
public class question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter a number");
        float num = input.nextFloat();

        if (num < 0) {
            System.out.println(num);
        }
        System.out.println();

    }
}
