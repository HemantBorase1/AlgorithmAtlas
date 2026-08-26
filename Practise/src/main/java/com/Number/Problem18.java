package com.Number;
/*
* An abundant number is a number where the sum of all its factors except itself is bigger than the number.

Example: 12
Factors of 12 (not including 12):

1, 2, 3, 4, 6

Add them:

1 + 2 + 3 + 4 + 6 = 16

Since 16 is bigger than 12, 👉 12 is an abundant number.

One more example: 18
1 + 2 + 3 + 6 + 9 = 21

21 is bigger than 18, so 18 is abundant. ✅

In short:
If the factors' sum > the number → Abundant number.
* */
public class Problem18 {
    public static void main(String[] args){
        int n=12;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum>n){
            System.out.println(" abundant number");
        }else {
            System.out.println("Not abundant Number");
        }
    }
}
