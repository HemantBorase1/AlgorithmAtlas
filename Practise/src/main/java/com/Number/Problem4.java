package com.Number;

public class Problem4 {
    /*
* A prime number is a natural number greater than 1 that has exactly two factors: 1 and itself.

Example: 7

Factors of 7 are 1 and 7.

Since 7 has exactly two factors, 7 is a prime number.
    * */
    public static boolean isPrime(int n){
        int count=1;
        boolean b=true;
        if(n<=1){
            return false;
        }else {
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count>2){
                b=false;
            }
        }
        return b;
    }

    public static void main(String[] args){
        int n=11;
        if(isPrime(n)){
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is Not Prime");
        }
    }
}
