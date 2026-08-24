package com.String;

public class Problem6 {
    public static void main(String[] args){
        String str="Hello@123#World!";
        int DigitCount=0;
        int SpecialCount=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                DigitCount++;
            } else if (!Character.isLetterOrDigit(c)) {
                SpecialCount++;
            }
        }
        System.out.println("Digit Count:"+DigitCount+" SpecialCount: "+SpecialCount);

    }
}
