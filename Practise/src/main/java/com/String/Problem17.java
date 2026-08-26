package com.String;

public class Problem17 {
    public static void main(String[] args){
        String str="bookeeper";
        int minIndex=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int count=0;
            for(int j=i+1;j<str.length();j++){
                if(c==str.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                minIndex=i;
                break;
            }
        }
        System.out.println("Min Frequency Occurance Character: "+str.charAt(minIndex));
    }
}
