package homework;
import java.util.Scanner;



public class question28 {
    public static boolean  isPrimenumber(int num) {
        boolean prime = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = true;
                break;

            }
        }
            if(!prime){
                System.out.println("it is prime number");
            }
            else System.out.println("it isnot prime number");



        return prime;

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        isPrimenumber(number);

    }


}
