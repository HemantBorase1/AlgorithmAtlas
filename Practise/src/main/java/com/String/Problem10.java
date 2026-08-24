package com.String;

/*
* Remove Spaces
* */
public class Problem10 {
    public static void main(String[] args){
        String str="I Love Java";
        String newstr="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!(c==' ')){
                newstr+=c;
            }

        }
        System.out.println(newstr);
    }
}
