package com.Array;

public class Problem2 {
    public static void main(String[] args){
        int arr[]={42, 7, 3, 56, 18, 73, 29, 5, 64};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum Value in Array:"+min);
    }
}
