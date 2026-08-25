package com.String;

public class Problem13 {
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
            if(count>1){
                found+=c;
            }
        }
        System.out.println("Repeated Character Found:");
        for(int i=0;i<found.length();i++){
            System.out.print(found.charAt(i)+" ");
        }
    }
}
