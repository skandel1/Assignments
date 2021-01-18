package Remhomework;

public class question41 {
    public String duplicateLetters(String word){
        char [] mac = word.toCharArray();
        for(int i = 0; i<mac.length; i++)  {
            for(int j= i +1; j< mac.length; j++) {
                if(mac[i] ==mac[j]){
                    System.out.print(mac[j]);
                }
            }
        }

     return word;
    }


}
