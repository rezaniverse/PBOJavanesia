/*
 Dibuat untuk memenuhi tugas perkuliahan Pemprograman Berbasis Objek
 Riize
 Date: 2024-03-15
 */

public class getVolumeTabung {
    public static void main(String[] args) {
        System.out.println("-> Program java untuk mencari Volume Tabung <-");

        double diameter = 5; 
        double tinggi = 10;

        double jariJari = diameter / 2;
        double volume = 3.14159 * jariJari * jariJari * tinggi;
        System.out.println("Volume Tabung: " + volume);
    }
}
