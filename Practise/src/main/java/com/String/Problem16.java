package com.String;

public class Problem16 {
    public static void main(String[] args){
        String str="bookeeper";
        int maxIndex=0;
        for(int i=0;i<str.length();i++){
            int count=1;
            char c=str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(c==str.charAt(j)){
                    count++;
                }
            }
            if(count>maxIndex){
                maxIndex=i;
            }
        }
        System.out.println("Max Frequecy Character: "+str.charAt(maxIndex));
    }
}
