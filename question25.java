package homework;

import java.util.Scanner;

public class question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of students");
        int num = input.nextInt();
        float highestscore =0;
        for (int i =1; i<=num; i++) {
            System.out.println("enter the name of student");
            String name = input.next();

            System.out.println("enter the score of student");
            float score = input.nextFloat();

            if(highestscore<score)
                 highestscore = score;





        }
        System.out.println("the  of highest scorer is " +highestscore);




    }
}
