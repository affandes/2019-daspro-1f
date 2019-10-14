package day04;

public class Kasus3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        boolean hasil1 = x++ < --y || x++ > --y;
        boolean hasil2 = x == y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("hasil1 = " + hasil1);
        System.out.println("hasil2 = " + hasil2);
    }
}
