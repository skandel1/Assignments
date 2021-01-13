package homework;

public class question35 {
    public int secLargest(int [] n){
        int j = n[0];


        for (int i = 0; i<n.length; i++) {
            if (n[i]>j) {
                j = n[i];
            }


        }
        return j;


    }
    public int largest(int [] array) {
        int fmax = array[0];
        int smax = array[0];
        for (int i = 0; i<array.length; i++) {
            if (array[i]>fmax) {
                smax = fmax;
                fmax = array[i];


            }
            else if(array[i] > smax)   {
                smax = array[i];
            }
        }
        return smax;
    }
}
