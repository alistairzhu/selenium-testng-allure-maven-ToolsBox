package com.sample.testng.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GenericsBox<T> {
    private T t;
    private int myInt = 9;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {


        GenericsBox<Integer> integerBox = new GenericsBox<Integer>();
        GenericsBox<String> stringBox = new GenericsBox<String>();
        GenericsBox anyBox = new GenericsBox();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));
        anyBox.add(new String("---any box Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
        System.out.printf("Any Value :%s\n", anyBox.get());

        System.out.printf("----------------");

        ineratorDemo();



    }


    public static void ineratorDemo(){
        ArrayList names = new ArrayList();
        names.add("Chaitanya");
        names.add("Steve");
        names.add("Jack");


        Iterator it = names.iterator();

        while(it.hasNext()) {
            String obj = (String)it.next();
            System.out.println(obj);
        }

        System.out.println("----++++++-----");
        List<String> capitals = Arrays.asList("Prague", "Bratislava", "Warsaw",
                "Budapest", "Washington","Prague");

        for (String str:capitals){
            System.out.println(str);

        }

        System.out.println("++++++++++");
        List thisone = Arrays.asList("Prague", 1, 2, new GenericsBox().myInt,
                "Budapest", "Washington","Prague");

        for (Object strA:thisone){
            System.out.println(strA);

        }
    }


}