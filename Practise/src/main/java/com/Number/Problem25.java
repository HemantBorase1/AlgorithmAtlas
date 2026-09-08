package com.Number;

public class Problem25 {
    public static void main(String[] args){
        int n=1234;
        int last_digit=0;
        while (n!=0){
            last_digit=n%10;
            break;
        }
        System.out.println("Last Digit:"+last_digit);
    }
}
