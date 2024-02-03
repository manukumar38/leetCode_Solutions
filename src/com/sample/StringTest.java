package com.sample;

public class StringTest {

    public static void main(String[] args) {
        String str = "adshdhudjpspdndmdmxksjdj";

        for (int i=0;i<str.length()-2;i++) {
            System.out.println(str.substring(i,i+3));
        }
    }
}
