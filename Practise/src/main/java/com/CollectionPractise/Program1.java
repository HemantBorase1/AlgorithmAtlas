package com.CollectionPractise;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

    public static void main(String[] args){
        List l=new ArrayList<>();
        l.add("Hello");
        l.add(20);
        l.add(1,"Bhasa");
        List l2=new ArrayList<>();
        l2.add(10);
        l2.add(20);
        l.addAll(l2);
        System.out.println(l);
    }
}
