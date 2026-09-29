package com.Array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={5,7,9,11,13};
        int target=11;
        int result=binarySearch(arr,target);
        if(result!=-1){
            System.out.println("Index found at Index:"+result);
        }else {
            System.out.println("Element is Not Found");
        }
    }
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int End=arr.length-1;
        while(start<=End){
            int mid=(start+End)/2;
            if(arr[mid]==target){
              return mid;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else {
                End=mid-1;
            }
        }
        return -1;
    }
}
