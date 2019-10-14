package day04;

public class Kasus1 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        boolean nilai = x && x;
        boolean nilai2 = y || y;

        boolean z = 76 < 36 && 70 == 70;
        boolean d = 80 > 70 || 30 == 40;

        System.out.println(nilai); // true
        System.out.println(nilai2); // false
        System.out.println(z); // false
        System.out.println(d); // true
    }
}
