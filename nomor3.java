package Tugas1SDA;

import java.util.ArrayList;

public class nomor3 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();

        nama.add("S");
        nama.add("F");
        nama.add("A");
        nama.add("R");

        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));
    }
}
