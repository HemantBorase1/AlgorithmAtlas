package com.String;

public class Problem7 {
    public static void main(String[] args){
        String str="HelloWorld";
        int lower=0;
        int Higher=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLowerCase(c)){
                lower++;
            }else if (Character.isUpperCase(c)){
                Higher++;
            }
        }
        System.out.println("Higher: "+Higher+" Lower:"+lower);
    }
}
