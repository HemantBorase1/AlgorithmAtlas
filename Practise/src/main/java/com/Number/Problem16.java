package com.Number;

public class Problem16 {
/*
* Check Spy Number
* The Sum of Digit == Product of Digit ? "Spy Number " : "Not Spy Number";
* */
    public static void main(String[] args){
        int n=123;
        int sum=0;
        int prod=1;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            prod=prod*digit;
            n/=10;
        }
        if(sum==prod){
            System.out.println("Spy Number");
        }else {
            System.out.println("Not Spy Number");
        }
    }
}
