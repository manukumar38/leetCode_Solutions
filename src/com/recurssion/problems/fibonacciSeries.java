package com.recurssion.problems;

public class fibonacciSeries {

    static int n1=0,n2=1,n3;
    static void fib1(int n) {
        if (n>0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" "+n3);
            fib1(n-1);
        }
    }

    //to find nth fibonacci number
    static int fib(int n)  {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = fib(4);
        System.out.println(n+"\n");

        System.out.println(n1+" "+n2);
        fib1(4);
    }
}
