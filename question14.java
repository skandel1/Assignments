package homework;
import java.util.Scanner;
public class question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1");
        float num1 = input.nextFloat();
        System.out.println("Enter num2");
        float num2 = input.nextFloat();

        if (num1 ==num2) {
            System.out.println("num1 is equal to num2");

        }
        else if (num1 < num2) {
            System.out.println("num1 is less than num2");
        }
        else {
            System.out.println("num1 is greater than num2");
        }

    }
}
