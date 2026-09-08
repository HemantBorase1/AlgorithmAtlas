package com.Array;

import java.util.Arrays;

public class BubbleSort_pgm {
    public static void main(String[] args){
        int arr[]={42, 7, 19, 3, 56, 12, 89, 1, 34, 25, 68, 9, 73, 15};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
