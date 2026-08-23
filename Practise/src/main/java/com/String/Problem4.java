package com.String;

public class Problem4 {
   public static void main(String[] args){
       String str="Java is easy";
       int count=1;
       for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           if(c==' '){
               count++;
           }
       }
       System.out.println(count);
   }

}
