package com.Number;

public class Problem15 {
    public static void main(String[] args){
        int n=9;
        int result=n*n;
        int sum=0;
        while(result!=0){
            int digit=result%10;
            sum+=digit;
            result/=10;
        }
        if(sum==n){
            System.out.println("Neon Number");
        }else {
            System.out.println("Not Neon Number");
        }
    }
}
