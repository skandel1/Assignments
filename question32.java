import java.util.Scanner;

public class question32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("please enter the number of array");
         n = input.nextInt();
         int a[] = new int[n];
        System.out.println("enter all elements");
        for(int i = 0; i<n; i++) {
            a[i] = input.nextInt();
            sum = sum+a[i];
        }
        System.out.println("sum = " + sum);



    }
}
