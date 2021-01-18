package Remhomework;

public class question38 {
    String checkPalindrome(String str) {
       String rev = "";
        char [] Characters = str.toCharArray();
        for (int i = Characters.length-1; i>= 0; i--)
            rev = rev + Characters[i];
            if (str.equals(rev))
                System.out.println("it is palindrome");
            else System.out.println("it is not pallindrome");


        return rev;

    }
    String checkPalindrome2(String str) {
        String rev = "";
        int length = str.length();
        for (int i = length-1; i>= 0; i-- )
            rev = rev + str.charAt(i);
            if (str.equals(rev)) System.out.println("it is palindrome");
            else System.out.println("it is not palindrome");

        return rev;
    }

}