package com.lessons.hello;

public class Lessons {
    public static void main(String[] args) {
    System.out.println("hello Archy");
    byte b = 10;
    short c = 5;
    int a = b + 23;

    long myLongVal = 123_456_789_876L;
    float myFloatVal = 23.56f;
    double myDoubleVal = 56.23d;
    double num = a + b + c + myLongVal + myDoubleVal + myFloatVal;
        System.out.println(num);
        System.out.println(myDoubleVal / 3);
        byte q = (byte) myLongVal;
        System.out.println("byte " + q);
        char c1 = 'A';
        char c2 = '\u00A9';
        System.out.println(c2);
        System.out.println(c1);
        System.out.println();


    }
}
