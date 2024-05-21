/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author GF63-837
 */

import java.util.Scanner;
public class TestSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan tiga sisi segitiga
        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();

        // Meminta pengguna memasukkan warna
        System.out.print("Masukkan warna: ");
        String color = input.next();

        // Meminta pengguna memasukkan nilai boolean untuk filled
        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean filled = input.nextBoolean();

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        // Menampilkan informasi tentang segitiga
        System.out.println("Segitiga: " + segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Terisi: " + segitiga.isFilled());
    }
}
