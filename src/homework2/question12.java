package homework2;
import java.util.Scanner;
public class question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        int x= input.nextInt();
        System.out.println("enter the second number");
        int y= input.nextInt();
        int temp ;
         temp = x;
         x = y;
         y = temp;
        System.out.println(x);
        System.out.println(y);

        System.out.println("Please enter a");
        int a = input.nextInt();
        System.out.println("please enter b");
        int b = input.nextInt();
        int c = a + b;
        int a1 = c-a;
        int b1 = c-b;
        System.out.println(a1);
        System.out.println(b1);
    }
}
