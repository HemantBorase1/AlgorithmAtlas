package com.String;

public class Problem8 {
    public static void main(String[] args){
        String str="HELLO";
        String low="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            char l=Character.toLowerCase(c);
            low+=l;
        }
        System.out.println(low);
    }
}
