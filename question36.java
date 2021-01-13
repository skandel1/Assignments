package homework;

public class question36 {
    public int[] duplicateElement(int []n) {
        for(int i = 0; i<n.length; i++) {
            for (int j = i +1; j<n.length; j++) {
                if (n[i] == n[j])  {
                    System.out.println(n[j]);
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int s [] = { 5,8,7,3,2,8,5};
        question36 obj = new question36();
        obj.duplicateElement(s);
    }
}
