package com.Number;

public class Problem5 {

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
        int a=5,b=50;
        System.out.println("Prime Number Between "+a+" to "+b+" :");
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
