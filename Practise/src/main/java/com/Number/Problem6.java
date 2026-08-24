package com.Number;

public class Problem6 {
    public static boolean isPrime(int n){
        int count=1;
        if(n<=1){
            return false;
        }else{
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count>2){
                return false;
            }
        }
        return true;
    }
    public static int NthPrime(int n){
        int count=0;

        for(int i=2;;i++){
            if(isPrime(i)){
                count++;
                if(count==n){
                    return i;
                }
            }
        }

    }
    public static void main(String[] args){
        int n=12;
        int Output=NthPrime(n);
        System.out.println(Output);
    }
}
