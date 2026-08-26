package com.CollectionPractise;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class Program1 {

    public static void main(String[] args){
        List l=new ArrayList<>();
        l.add("Hello");
        l.add(20);
        l.add(1,"Bhasa");
        List l2=new ArrayList<>(20);
        l2.add(10);
        l2.add(20);
        l.addAll(l2);
        System.out.println(l);
        System.out.println(l instanceof RandomAccess); // true
        System.out.println(l2 instanceof Serializable); // true
        System.out.println(l instanceof Cloneable);  // true
        System.out.println(l instanceof RandomAccess); // true
    }
}
