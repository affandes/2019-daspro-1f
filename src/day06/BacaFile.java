package day06;

import java.io.IOException;
import java.nio.file.*;

public class BacaFile {
    public static void main(String[] args) {
        try {
            Path file = Paths.get("D:/contoh1.txt");
            byte[] data = Files.readAllBytes(file);
            String isi = new String(data);
            System.out.println(isi);
        } catch (IOException ex) {
            System.out.println("File tidak ditemukan");
        }
    }
}
