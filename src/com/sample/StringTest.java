package com.sample;

public class StringTest {

    public static void main(String[] args) {
        String str1 = "Sunday";
        String str2 = "Sun";

        int index = str1.indexOf(str2);
        System.out.println(index);
        System.out.println(str1.contains(str2));

        /*for (int i=0;i<str.length()-2;i++) {
            System.out.println(str.substring(i,i+3));
        }*/
    }
}
