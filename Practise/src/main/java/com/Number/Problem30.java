package com.Number;

public class Problem30 {
    public static void main(String[] args){
        // Find Smallest Digit
        int n=6718925;
        int min=5;
        while(n!=0){
            int digit=n%10;
            if(digit<min){
                min=digit;
            }
            n/=10;
        }
        System.out.println(min);
    }
}
