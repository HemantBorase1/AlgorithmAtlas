package com.String;

import java.util.Locale;

public class Problem3 {
    public static void main(String[] args){
        String str="Hello";
        String lower=str.toLowerCase();
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0;i<lower.length();i++){
            if(lower.charAt(i)=='a'||lower.charAt(i)=='e'||lower.charAt(i)=='o'||lower.charAt(i)=='i'||lower.charAt(i)=='u'){
                vowelCount++;
            }else {
                consonantCount++;
            }
        }
        System.out.println("VowelCount: "+vowelCount+" ConsonantCount: "+consonantCount);
    }
}
