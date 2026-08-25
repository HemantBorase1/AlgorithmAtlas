package com.Number;

/*
* 5 Square 25
* if 5 Contains in Square at Last Digit is Called Automorphic Number
* */
public class Problem13 {
    public static int square(int n){

        return n*n;
    }
    public static void main(String[] args){
        int n=5;
        int temp=n;
        boolean b=false;
        int result=square(n);
        int count=0;
        while(n!=0){
            int digit=n%10;
            count++;
            n/=10;
        }

        if(count==1){
            int digit=result%10;
            if(digit==temp){
               b=true;
            }
            result/=10;
        }

        if(b){
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Not Automorphic Number");
        }

    }
}
/* This is For Only Single Digit but Same process for other in else if*/