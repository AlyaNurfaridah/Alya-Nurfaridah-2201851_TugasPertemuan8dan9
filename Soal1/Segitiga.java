/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author GF63-837
 */

public class Segitiga extends GeometricObject {
    private double sisi1;
    private double sisi2;
    private double sisi3;

    // Tiga atribut untuk menyimpan panjang sisi segitiga
    public Segitiga() {
        this.sisi1 = 1.0;
        this.sisi2 = 1.0;
        this.sisi3 = 1.0;
    }

     // konstruktor dengan parameter untuk mengatur panjang sisi segitiga
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Getter dan setter untuk atribut side1
    public double getSide1() {
        return sisi1;
    }

    public void setSide1(double side1) {
        this.sisi1 = sisi1;
    }

    // Getter dan setter untuk atribut side2
    public double getSide2() {
        return sisi2;
    }

    public void setSide2(double side2) {
        this.sisi2 = sisi2;
    }

    // Getter dan setter untuk atribut side3
    public double getSide3() {
        return sisi3;
    }

    public void setSide3(double side3) {
        this.sisi3 = sisi3;
    }

    // Metode untuk menghitung luas segitiga menggunakan rumus Heron
    public double getArea() {
        double s = (sisi3 + sisi3 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    // Metode untuk menghitung keliling segitiga
    public double getPerimeter() {
        return sisi1 + sisi2 + sisi3;
    }

    // Metode toString untuk menampilkan representasi string dari segitiga
    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }
}
