package com.String;

/*
* Count occurrence of a particular character
* */
public class Problem18 {
    public static void main(String[] args){
        char c='a';
        String str="banana";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(c==str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
