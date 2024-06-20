package com.example.PBO.TugasCRUD;

import java.sql.*;
import java.util.Scanner;

public class KoneksiDb {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/pbosql";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void insert(Scanner scanner) {
        System.out.print("Input Judul Buku: ");
        String judul_buku = scanner.nextLine();

        System.out.print("Input Tahun Terbit: ");
        int tahun_terbit = scanner.nextInt();

        System.out.print("Input stock: ");
        int stok = scanner.nextInt();

        System.out.print("Input Kode Penulis/Buku: ");
        int penulis = scanner.nextInt();

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "INSERT INTO buku (judul_buku, tahun_terbit, stok, penulis) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, penulis);

            ps.execute();

            ps.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void show() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            rs = stmt.executeQuery("SELECT * FROM buku");
            int i = 1;
            while (rs.next()) {
                //System.out.println("Data ke-" + i);
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("Judul Buku: " + rs.getString("judul_buku"));
                System.out.println("Tahun Terbit: " + rs.getString("tahun_terbit"));
                System.out.println("Jumlah Stok: " + rs.getString("stok"));
                System.out.println("Kode Buku/Penulis: " + rs.getString("penulis"));
                
                i++;
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update(Scanner scanner) {
        System.out.print("Input kode buku/penulis: ");
        int Kdpenulis = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Input Judul Baru: ");
        String judul_buku = scanner.nextLine();

        System.out.print("Input Tahun terbit Baru: ");
        int tahun_terbit = scanner.nextInt();

        System.out.print("Input Stock Baru: ");
        int stok = scanner.nextInt();

        System.out.print("Input Kode Buku/Penulis Baru: ");
        int penulis = scanner.nextInt();

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "UPDATE buku SET judul_buku = ?, tahun_terbit = ?, stok = ?, penulis = ? WHERE penulis = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, penulis);
            ps.setInt(5, Kdpenulis);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Sukses, Data berhasil diupdate.");
            } else {
                System.out.println("Failed, Data tidak ditemukan.");
            }

            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(Scanner scanner) {
        System.out.print("Input kode buku/penulis: ");
        int penulis = scanner.nextInt();

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "DELETE FROM buku WHERE penulis = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, penulis);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Sukses, Data berhasil didelete.");
            } else {
                System.out.println("Failed, Data tidak ditemukan.");
            }

            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
