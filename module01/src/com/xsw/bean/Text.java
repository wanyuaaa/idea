package com.xsw.bean;

import java.util.ArrayList;

public class Text {

    private static int num;

    public static void main(String[] args) {
        System.out.println("helloWorld!");

        ArrayList arraylist = new ArrayList<>();

        System.out.println("arraylist = " + arraylist);

        System.out.println("Text.main");
    }

    public static void method() {
        num = 10;

    }
}
