package com.sample.practice;

import java.util.StringJoiner;

public class UseStringJoinMethod {

    public static void main(String[] args) {

        String[] input = {"docker", "kubernetes", "springboot", "mongoDb", "microservices"};
        String joinResult = String.join("-", input);
        System.out.println(joinResult);

        StringJoiner stringJoiner = new StringJoiner("-");
        stringJoiner.add("abc");
        stringJoiner.add("xyz");
        stringJoiner.add("def");
        stringJoiner.add("rst");
        System.out.println(stringJoiner);

        StringJoiner stringJoiner1 = new StringJoiner("-", "{", "}");
        stringJoiner1.add("abc");
        stringJoiner1.add("xyz");
        stringJoiner1.add("def");
        stringJoiner1.add("rst");
        System.out.println(stringJoiner1);
    }
}
