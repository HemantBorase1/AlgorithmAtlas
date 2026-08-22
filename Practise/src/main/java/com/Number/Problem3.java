package com.Number;

/*
* Armstrong Number Problem:
* 1³ + 5³ + 3³
= 1 + 125 + 27
= 153
*
* */
public class Problem3 {

    public static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=cubeNum(digit);
            n/=10;
        }

        return original==sum;
    }
    public static int cubeNum(int n){
        int ans=n*n*n;
        return ans;
    }

    public static void main(String[] args){
        int n=153;
        if(isArmstrong(n)){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is Not Armstrong");
        }
    }
}
