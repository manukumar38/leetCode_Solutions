package com.recurssion.problems;

public class StringPowerSet {

    static void abc(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        //pick
        abc(input.substring(1), output+input.charAt(0));

        //don't pick
        abc(input.substring(1), output);
    }

    public static void main(String[] args) {
        abc ("abc", "");
    }
}
