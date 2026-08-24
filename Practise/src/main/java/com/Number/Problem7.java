package com.Number;

/*
* Factorial of an Number:
* 5: 5*4*3*2*1=120;
* */
public class Problem7 {
    public static void main(String[] args){
        int n=5;
        int ans=1;
        for(int i=n;i>=1;i--){
          ans=ans*i;
        }
        System.out.println(ans);
    }
}
