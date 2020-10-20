package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        return l.isEmpty() && r.isEmpty() ? true
                : l.charAt(0) == r.charAt(r.length() - 1) && l.charAt(l.length() - 1) == r.charAt(0) ? true
                : false;
    }

    public static void main(String[] args) {
        System.out.println(check(" ", " "));
        System.out.println(check("sparkling", "groups"));
        System.out.println(check("booking", "grabber"));
    }
}
