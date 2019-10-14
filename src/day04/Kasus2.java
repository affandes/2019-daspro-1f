package day04;

public class Kasus2 {
    public static void main(String[] args) {
        boolean benar = false;
        boolean salah = true;
        boolean benar1 = true;
        boolean salah2 = false;

        boolean hasil1 = benar && salah ^ benar || benar1;
        boolean hasil2 = salah || salah2 && benar ^ benar1;

        System.out.println("nilai 1 = " + !hasil1); //true
        System.out.println("nilai 2 = " + hasil2); // true

    }
}
