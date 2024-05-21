/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author GF63-837
 */

public class GeometricObject {
    private String color = "white";
    private boolean filled;

    //konstruktor tanpa argumen      
    public GeometricObject() {
    }

    //konstruktor dengan parameter untuk mengatur warna dan status filled    
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //getter untuk atribut color        
    public String getColor() {
        return color;
    }

    //setter atribut color    
    public void setColor(String color) {
        this.color = color;
    }

    //getter untuk atribut filled
    public boolean isFilled() {
        return filled;
    }

    //getter untuk atribut filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //metode untuk mengembalikan nilai dari kelas GeometricObject yang menampilkan warna apakah terisi atau tidak    
    @Override
    public String toString() {
        return "color: " + color + " and filled: " + filled;
    }
}

