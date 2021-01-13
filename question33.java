package homework;
import java.util.Arrays;
public class question33 {
     public  int ascendingNum(int[] arr) {
         Arrays.sort(arr);
         int n = arr.length;
         for ( int i = 0; i < n; i++)
             System.out.print(arr[i] + "");
         return n;
     }

}
