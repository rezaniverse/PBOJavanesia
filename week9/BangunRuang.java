package week9;

public class BangunRuang {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int sisi;

    // Constructors 
    public BangunRuang(int sisi) {
        this.sisi = sisi;
    }

    public BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int volumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    public int volumeBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    public double volumeBola(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public double volumeKerucut(double radius, double tinggi) {
        return (1.0 / 3.0) * Math.PI * radius * radius * tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getSisi() {
        return sisi;
    }
}
