package com.example.PBO.TugasCRUD;
import java.util.Scanner;

public class Home {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit Program");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("=== Tambahkan Data Buku ===");
                    KoneksiDb.insert(scanner);
                    break;
                case 2:
                    System.out.println("=== Show Data Buku ===");
                    KoneksiDb.show();
                    break;
                case 3:
                    System.out.println("=== Update or Edit Buku ===");
                    KoneksiDb.update(scanner);
                    break;
                case 4:
                    System.out.println("=== Delete Buku ===");
                    KoneksiDb.delete(scanner);
                    break;
                case 5:
                    System.out.println("Terimakasih sudah menggunakan program ini...");
                    return;
                default:
                    System.out.println("Opsi menu tidak valid, coba lagi!");
            }
        }
    }
}
