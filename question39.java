package Remhomework;

public class question39 {
    public String printInitials(String str) {
        System.out.println(str);

        int len = str.length();


        String str1 = "";
        for(int i = 0; i<len; i++) {
            char ch = str.charAt(i);
            if(ch!= ' ') {
                str1 = str1+ch;

            }else {
                System.out.print(Character.toUpperCase(str1.charAt(0))+".");
            str1 = "";
            }

        }
        String str2 = "";
        for(int j = 0; j<str1.length();j++) {
            if(j == 0) str2 = str2 + Character.toUpperCase(str1.charAt(0));
            else str2 = str2 + Character.toLowerCase(str1.charAt(j));
        }
        System.out.print(str2);
        return str;

    }



}
