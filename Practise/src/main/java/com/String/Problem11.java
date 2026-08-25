package com.String;

/*
* Find first non-repeating character
* */
public class Problem11 {

    public static void main(String[] args){
        String str="success";
        String found="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(c==str.charAt(j)){
                  count++;
                }
            }
            if(count==1){
                found+=c;
                break;
            }
        }
        System.out.println(found);
    }
}
