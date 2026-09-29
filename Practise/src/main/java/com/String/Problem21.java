package com.String;

public class Problem21 {
    public static void main() {
        String str="I love programming";
        String word[]=str.split(" ");
        int index=0;
        int max=2;
        for(int i=0;i<word.length;i++){
            String words=word[i];
            int count=0;
            for(int j=0;j<words.length();j++){
                count++;
            }
            if(count>max){
                max=count;
                index=i;
            }
        }
        System.out.println("Logest Word in the String: "+word[index]);
    }
}
