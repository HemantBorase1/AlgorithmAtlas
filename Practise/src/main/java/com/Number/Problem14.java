package com.Number;

public class Problem14 {
    public static void main(String[] args){
        int n=18;
        int temp=n;
        int sum=0;
        while(n!=0){
            sum=sum+(n%10);
            n/=10;
        }
        if(temp%sum==0){
            System.out.println("Harshad Number");
        }else {
            System.out.println("Not Harshad Number");
        }
    }
}
