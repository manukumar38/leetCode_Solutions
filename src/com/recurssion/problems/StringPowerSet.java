package com.recurssion.problems;

public class StringPowerSet {

    static void abc(String input, String output) {
        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }

        //don't pick
        abc(input.substring(1), output);

        //pick
        abc(input.substring(1), output+input.charAt(0));

    }

    public static void main(String[] args) {

        abc ("abc", "");
    }
}
