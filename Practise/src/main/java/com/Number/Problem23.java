package com.Number;

public class Problem23 {
    public static void main(String[] args){
        int n=1234;
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println("Total Digit Count:"+count);
    }
}
