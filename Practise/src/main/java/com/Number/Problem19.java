package com.Number;
/*
* A deficient number is a positive integer whose sum of its proper divisors is less than the number itself.

Proper divisors are the positive divisors of a number, excluding the number itself.
Examples
8

Proper divisors: 1, 2, 4
Sum = 1 + 2 + 4 = 7
Since 7 < 8, 8 is a deficient number.
10

Proper divisors: 1, 2, 5
Sum = 1 + 2 + 5 = 8
Since 8 < 10, 10 is a deficient number.
15

Proper divisors: 1, 3, 5
Sum = 1 + 3 + 5 = 9
Since 9 < 15, 15 is a deficient number.
* */

public class Problem19 {
    public static void main(String[] args){
        int n=8;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum<n){
            System.out.println("Deficient Number");
        }else {
            System.out.println("Not Deficient Number");
        }
    }
}
