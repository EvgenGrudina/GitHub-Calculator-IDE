package app;

public class Main {
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        a = 8;
        b = 2;
        c = add(a, b);
        System.out.println(c);
        d = multiply(a, b);
        System.out.println(d);
        e = sub(a, b);
        System.out.println(e);
        f = div(a, b);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int div(int a, int b) {
        return a / b;
    }
}
