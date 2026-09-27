package com.Number;

public class Problem29 {
    public static void main(String[] args){
        // Find largest digit
        int n=1789236;
        int max=2;
        while(n!=0){
            int digit=n%10;
            if(digit>max){
                max=digit;
            }
            n/=10;
        }
        System.out.println("Max Digit: "+max);
    }
}
