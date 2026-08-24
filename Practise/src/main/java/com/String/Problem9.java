package com.String;

public class Problem9 {
    public static void main(String[] args){
        String str="HeLLo";
        String newstr="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
                char l=Character.toLowerCase(c);
                newstr+=l;
            }else {
                char U=Character.toUpperCase(c);
                newstr+=U;
            }
        }
        System.out.println(newstr);
    }
}
