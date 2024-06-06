package week9;

public class BangunDatar {
    private int panjang;
    private int lebar;
    private int sisi;

    // Constructors 
    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    public int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    public double luasSegitiga(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    public double luasLingkaran(double radius) {
        return Math.PI * radius * radius;
    }

    // Getters
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getSisi() {
        return sisi;
    }
}
