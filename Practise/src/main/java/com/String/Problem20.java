package com.String;

public class Problem20 {
   public static void main() {
    String str1="Hello";
    String str2="World";
       System.out.println(commonChar(str1,str2));
    }
// Not Proper Solution Repeat
    public static String commonChar(String str1, String str2) {
        String ans = "";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    ans += ch;
                    break;
                }
            }
        }

        return ans;
    }


}
