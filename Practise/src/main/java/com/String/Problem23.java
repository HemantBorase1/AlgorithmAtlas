package com.String;

import java.util.Arrays;

public class Problem23 {
    public static void main() {
        String str="I Love Programming";
        String words[]=str.split(" ");
        String[] rev=new String[words.length];

        int j=0;
        for(int i=words.length-1;i>=0;i--){

            rev[j]=words[i];
            j++;
        }
        String result=String.join(" ",rev);
        System.out.println(result);

    }
}
