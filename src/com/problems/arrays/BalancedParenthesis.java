package com.problems.arrays;

import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {

        String input = "{[()]}";
        /*solution using stack LIFO
        1. Iterare over the string for each character
        2. If the char is open bracket like {,[,( then push it to stack
        3. If the char is closed bracket like },],) the look at the top of the stack(peek) for matching
        open bracket, if matched then pop it out of stack
        4. after iteration is completed, if the stack is empty then the string has balanced parenthesis
         */
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<input.length(); i++) {
            if (input.charAt(i)=='{' || input.charAt(i)=='[' || input.charAt(i)=='(') {
                stack.push(input.charAt(i));
            } else if (!stack.empty() && (
                    (input.charAt(i)=='}' && stack.peek().equals('{'))
                            || (input.charAt(i)==']' && stack.peek().equals('['))
                            || (input.charAt(i)==')' && stack.peek().equals('(')))) {
                stack.pop();
            } else {
                stack.push(input.charAt(i));
            }
        }
        if(stack.empty()) {
            System.out.println("Balanced");
        } else
            System.out.println("Not Balanced");

    }
}
