package Remhomework;

public class question42 {
    public String[] duplicateWords(String sentance){
        int count;
        sentance = sentance.toLowerCase();
        String[] words = sentance.split(" ");
        for(int i = 0;  i< words.length; i++) {
            count =1;
            for (int j = i+1; j< words.length; j++) {
                if (words[i].equals(words[j])){
                    count++;
                    words[j] = "0";

                }
            }
            if(count>1 && words[i]!="0") System.out.println(words[ i ]);
        }

        return words;

    }

}
