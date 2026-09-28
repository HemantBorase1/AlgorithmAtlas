package com.Number;

public class Problem31 {
    public static void main(String[] args){
        int n=12345;
        int d=3;
        int rev=0;
        int ans=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        while(rev!=10){
            int digit=rev%10;
            if(digit==d){
                rev/=10;
            }
            ans=ans*10+digit;
            n/=10;
        }
        System.out.println(ans);
    }
}
