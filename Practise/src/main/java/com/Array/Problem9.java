package com.Array;

import java.io.PrintStream;

public class Problem9 {
    public static void main(String[] args){
        int arr[]={-1,2,7,-4};
        int positive=0;
        int negative=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negative++;
            }else {
                positive++;
            }
        }
        System.out.println("Positive:"+positive+" Negative:"+negative);
    }
}
