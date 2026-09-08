package com.Number;

public class Problem24 {

    public static void main(String[] args){
        int n=4781234;
        int first_digit=0;
        while(n!=0){
            int digit=n%10;
            n/=10;
            if(n==0){
                first_digit=digit;
                break;
            }
        }
        System.out.println("First Digit:"+first_digit);
    }
}
