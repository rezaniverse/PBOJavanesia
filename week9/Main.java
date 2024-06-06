package week9;

public class Main {
    public static void main(String[] args) {
        BangunDatar persegi = new BangunDatar(4);
        BangunDatar persegiPanjang = new BangunDatar(5, 3);

        BangunRuang kubus = new BangunRuang(4);
        BangunRuang balok = new BangunRuang(5, 3, 2);

        System.out.println("Bangun Datar:");
        System.out.println("Persegi dengan sisi: " + persegi.getSisi() + ", luas: " + persegi.luasPersegi(persegi.getSisi()));
        System.out.println("Persegi Panjang dengan panjang: " + persegiPanjang.getPanjang() + " dan lebar: " + persegiPanjang.getLebar() + ", luas: " + persegiPanjang.luasPersegiPanjang(persegiPanjang.getPanjang(), persegiPanjang.getLebar()));

        double alasSegitiga = 6.0;
        double tinggiSegitiga = 4.0;
        System.out.println("Segitiga dengan alas: " + alasSegitiga + " dan tinggi: " + tinggiSegitiga + ", luas: " + persegiPanjang.luasSegitiga(alasSegitiga, tinggiSegitiga));

        System.out.println("\nBangun Ruang:");
        System.out.println("Kubus dengan sisi: " + kubus.getSisi() + ", volume: " + kubus.volumeKubus(kubus.getSisi()));
        System.out.println("Balok dengan panjang: " + balok.getPanjang() + ", lebar: " + balok.getLebar() + ", dan tinggi: " + balok.getTinggi() + ", volume: " + balok.volumeBalok(balok.getPanjang(), balok.getLebar(), balok.getTinggi()));

        double radiusBola = 3.0;
        double tinggiKerucut = 7.0;
        System.out.println("Bola dengan radius: " + radiusBola + ", volume: " + kubus.volumeBola(radiusBola));
        System.out.println("Kerucut dengan radius: " + radiusBola + " dan tinggi: " + tinggiKerucut + ", volume: " + kubus.volumeKerucut(radiusBola, tinggiKerucut));
    }
}
