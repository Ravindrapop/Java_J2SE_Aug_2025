package com.deepak.opretar;

public class RelationOpretarDemo1 {
    public static boolean lessthan(int a, int b) {
        return (a < b);
    }

    public static boolean greaterthan(int a, int b) {
        return (a > b);
    }

    public static boolean lessthan_equal(int a, int b) {
        return (a <= b);
    }

    public static boolean greaterthan_equal(int a, int b) {
        return (a >= b);
    }

    public static boolean not_equal(int a, int b) {
        return (a != b);
    }

    public static void main(String[] args) {

        System.out.println(lessthan(4, 5));
        System.out.println(greaterthan(4, 5));
        System.out.println(lessthan_equal(4, 5));
        System.out.println(greaterthan_equal(4, 5));
        System.out.println(not_equal(4, 5));
    }
}

