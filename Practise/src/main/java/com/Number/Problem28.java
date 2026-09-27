package com.Number;

public class Problem28 {
    public static void main(String[] args){
        int n=123456;
        int evencount=0;
        int oddcount=0;
        while(n!=0){
            int digit=n%10;
            if(digit%2==0){
                evencount++;
            }
            else {
                oddcount++;
            }
            n/=10;
        }
        System.out.println("Even Count:"+evencount+"\n Odd Count:"+oddcount);
    }
}
