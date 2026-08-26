package com.String;
/*
* listen:
l → 1
i → 1
s → 1
t → 1
e → 1
n → 1

silent:
s → 1
i → 1
l → 1
e → 1
n → 1
t → 1
*
* Problem: Check frequency of characters in two strings
* */
public class Problem19 {
    public static void main(String[] args){
        String str1="silent";
        String str2="listen";
        boolean b=false;
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                char c=str1.charAt(i);
                for(int j=0;j<str2.length();j++){
                    if(c==str2.charAt(j)){
                        b=true;
                        break;
                    }
                }
            }
        }
        else {
            b=false;
        }
        if(b){
            System.out.println("Same Character Frequency in Both String");
        }else{
            System.out.println("Not Same Character Frequency in Both String");
        }
    }
}
