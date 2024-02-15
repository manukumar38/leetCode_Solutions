package com.recurssion.problems;

public class StringPowerSet {

    static void abc(String input, String output) {
        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }

        //subset of bc => {"b" ,"c","bc", ""}
        abc(input.substring(1), output);

        //adding a to subset of bc => {"ab","ac","abc","a"}, combine both subsets
        abc(input.substring(1), output+input.charAt(0));

    }
    public static void main(String[] args) {

        abc ("abc", "");
    }
}
