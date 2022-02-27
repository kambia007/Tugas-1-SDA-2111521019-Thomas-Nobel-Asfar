package Tugas1SDA;

import java.util.ArrayList;

public class nomor5dan6 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();

        nama.add("S");
        nama.add("F");
        nama.add("A");
        nama.add("R");

        nama.remove(3);
        System.out.println(nama);

        nama.remove(2);
        System.out.println(nama);

        nama.remove(0);
        System.out.println(nama);
        
        nama.add(0,"e");
        System.out.println(nama);
        
        nama.add(2,"f");
        System.out.println(nama);
        
        nama.add(3,"g");
        System.out.println(nama);
        
        nama.add(4,"h");
        System.out.println(nama);
        
        nama.add(6,"h");
        System.out.println(nama);

        nama.add(-3,"j");
        System.out.println(nama);
    }
}
