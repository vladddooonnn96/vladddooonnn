package com.company.lesson12;

public class StringDemo {
    public static void main(String[] args) {
        verifyString("I like java!!!");
        verifyString("I hate java");
        lastChar("At the start of the end,surrender the throne");
        findPosition("I like java!!!");
        modifyString("I like java!!!");
        cutString("I like java!!!");

    }

    public static void verifyString(String s) {
        System.out.println(s);
        System.out.println("Ends with " + s.endsWith("!!!"));
        System.out.println("Start with " + s.startsWith("I like"));
        System.out.println(s.charAt(10));
    }

    public static void lastChar(String s) {
        int len = s.length() - 1;
        System.out.println(s.charAt(len));
    }

    public static void findPosition(String s) {
        System.out.println(s.indexOf("java"));
    }

    public static void modifyString(String s) {
        System.out.println(s.replace("a", "o"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
    public static void cutString(String s){
        System.out.println(s.substring(7,11));
    }
}
