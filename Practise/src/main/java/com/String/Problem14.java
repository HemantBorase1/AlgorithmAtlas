package com.String;
/*
* Remove Duplicate from String
* */
public class Problem14 {
    public static void main(String[] args){
        String str="success";
        String str2="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            boolean b=false;
            for(int j=0;j<str2.length();j++){
                if(c==str2.charAt(j)) {
                    b=true;
                    break;
                }
            }
            if(!b){
                str2+=c;
            }
        }
        System.out.println(str2);
    }
}
