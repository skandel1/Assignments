package Remhomework;

public class question40 {
    public String reverseString(String word) {
        char [] mac = word.toCharArray();
        for (int i = mac.length-1; i>=0; i--){
            System.out.print(mac[i]);
        }
       return word;
    }

}
