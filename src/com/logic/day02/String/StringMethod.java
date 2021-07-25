package com.logic.day02.String;

public class StringMethod {
    public static void main(String[] args) {
        String s = "aku suka java";
        System.out.println("Lengt s : " + s.length());

        // charAt
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(5));

        //substring
        String scut = s.substring(4, 8);
        System.out.println(scut);

        String  concat = s + "Bootcamp";
        System.out.println("concat : " + concat);

        //toUppercase
        String upperCase = s.toUpperCase();
        System.out.println("uppercase : " + upperCase);

        //tolowecase
        String lowerCase = s.toLowerCase();
        System.out.println("lowercase : "+ lowerCase );

        //string format
        String str = "18";
        String str2 = String.format("%4s", str).replace(' ', '0');
        System.out.println(str2);

        // replace
        String d, e;
        d = " I am newbie in C++. C++ rocks!";
        e = d.replace("C++", "Java");
        System.out.println(e);
    }
}
