package Basichomework;
import java.util.Scanner;
public class question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temperature in celsius");
        float celsius = input.nextFloat();
        float fahrenheit = (celsius * 9/5) +32;
        System.out.println(fahrenheit);
        System.out.println("Please enter temperature in fahrenheit");
        float f = input.nextFloat();
        float c = (f-32) * 5/9;
        System.out.println(c);
    }
}
