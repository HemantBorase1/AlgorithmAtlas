package com.Number;

public class Problem12 {
    public static int fact(int n){
        int r=1;
        for(int i=n;i>=1;i--){
            r=r*i;
        }
        return r;
    }
    public static void main(String[] args){
        int n=145;
        int temp=n;
        int sum=0;
        while (n!=0){
            int digit=n%10;
            sum+=fact(digit);
            n/=10;
        }
        if(sum==temp){
            System.out.println("Strong Number");
        }else {
            System.out.println("Not Strong Number");
        }
    }
}
